package DesignPatterns.FlyweightDesignPattern;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Document document = new Document();
        String text = "This is the Flyweight Pattern which helps in reducing the memory usage";
        String font = "Arial";
        int size = 5;
        String color = "Black";

        for (char c : text.toCharArray()){
            document.addCharacter(c, font, size, color);
        }

        document.display();
    }
}
