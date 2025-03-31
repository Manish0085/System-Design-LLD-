package DesignPatterns.FlyweightDesignPattern;

public class CharacterFlyweight {

    private final char character;

    public CharacterFlyweight(char character){
        this.character = character;
    }

    public char getCharacter(){
        return character;
    }
}
