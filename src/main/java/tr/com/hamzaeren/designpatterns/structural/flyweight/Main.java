package tr.com.hamzaeren.designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        CharacterType soldierType = CharacterFactory.getCharacterType(
                "Asker",
                "SoldierModel.obj",
                "RedTexture.png"
        );

        CharacterType civilianType = CharacterFactory.getCharacterType(
                "İnsan",
                "HumanModel.obj",
                "HumanTexture.png"
        );

        GameCharacter c1 = new GameCharacter(10, 20, "Ahmet", soldierType);
        GameCharacter c2 = new GameCharacter(30, 40, "Mehmet", soldierType);

        GameCharacter c3 = new GameCharacter(50, 60, "Ayşe", civilianType);

        c1.draw();
        c2.draw();
        c3.draw();
    }
}