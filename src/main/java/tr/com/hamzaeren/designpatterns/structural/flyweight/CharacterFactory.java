package tr.com.hamzaeren.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private CharacterFactory() {}

    private static final Map<String, CharacterType> types = new HashMap<>();

    public static CharacterType getCharacterType(
            String typeName,
            String model,
            String texture
    ) {
        if (!types.containsKey(typeName)) {
            types.put(typeName,
                    new CharacterType(typeName, model, texture));
        }

        return types.get(typeName);
    }
}