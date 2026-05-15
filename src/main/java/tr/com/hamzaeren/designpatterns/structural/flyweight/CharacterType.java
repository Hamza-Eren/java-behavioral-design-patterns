package tr.com.hamzaeren.designpatterns.structural.flyweight;

import java.util.logging.Logger;

public class CharacterType {
    private static final Logger logger = Logger.getLogger(CharacterType.class.getName());

    private final String typeName;
    private final String model;
    private final String texture;

    public CharacterType(String typeName, String model, String texture) {
        this.typeName = typeName;
        this.model = model;
        this.texture = texture;

        String message = String.format("%s tipi oluşturuldu.", typeName);
        logger.info(message);
    }

    public void render(int x, int y, String playerName) {
        String message = String.format("%s -> %s (%d, %d) Model: %s | Texture: %s", playerName, typeName, x, y, model, texture);
        logger.info(message);
    }
}