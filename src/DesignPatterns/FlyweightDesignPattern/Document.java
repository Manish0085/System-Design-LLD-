package DesignPatterns.FlyweightDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Document implements CharacterInterface{

    private final List<CharacterStyle> list = new ArrayList<>();
    private int position = 0;

    public void addCharacter(char ch, String font, int size, String color){
        CharacterFlyweight flyweight = new CharacterFlyweight(ch);
        list.add(new CharacterStyle(flyweight, font, color, size, position++));
    }

    @Override
    public void display() {
        for (CharacterStyle character: list){
            character.display();
        }
    }
}
