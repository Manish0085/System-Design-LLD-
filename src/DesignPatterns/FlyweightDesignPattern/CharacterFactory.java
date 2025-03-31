package DesignPatterns.FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<Character, CharacterFlyweight> cachedCharacter = new HashMap<>();

    public static CharacterFlyweight getCharacter(char character){

        cachedCharacter.putIfAbsent(character, new CharacterFlyweight(character));
        return cachedCharacter.get(character);
    }

    public static int getCacheSize(){
        return cachedCharacter.size();
    }
}
