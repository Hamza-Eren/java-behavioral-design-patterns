package tr.com.hamzaeren.designpatterns.structural.flyweight;

public class GameCharacter {
    private final int x;
    private final int y;
    private final String playerName;

    private final CharacterType type;

    public GameCharacter(
            int x,
            int y,
            String playerName,
            CharacterType type
    ) {
        this.x = x;
        this.y = y;
        this.playerName = playerName;
        this.type = type;
    }

    public void draw() {
        type.render(x, y, playerName);
    }
}