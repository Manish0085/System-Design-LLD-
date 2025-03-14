package DesignPatterns.FactoryDesignPattern.WithoutPattern;

import DesignPatterns.FactoryDesignPattern.WithPattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
