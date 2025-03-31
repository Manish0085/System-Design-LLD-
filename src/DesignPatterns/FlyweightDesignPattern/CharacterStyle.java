package DesignPatterns.FlyweightDesignPattern;

public class CharacterStyle implements CharacterInterface{

    private CharacterFlyweight flyweight;
    private String font;
    private String color;
    private int size;
    private int position;

    public CharacterStyle(CharacterFlyweight flyweight, String font, String color, int size, int position) {
        this.flyweight = flyweight;
        this.font = font;
        this.color = color;
        this.size = size;
        this.position = position;
    }


    @Override
    public void display() {
        System.out.println("char: "+flyweight.getCharacter()+
                " | Font: "+font+" | Color:"+color+" | Size: "+size+" | Position: "+position);
    }
}
