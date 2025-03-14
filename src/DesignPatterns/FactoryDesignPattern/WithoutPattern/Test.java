package DesignPatterns.FactoryDesignPattern.WithoutPattern;

import DesignPatterns.FactoryDesignPattern.WithPattern.Circle;
import DesignPatterns.FactoryDesignPattern.WithPattern.Rectangle;
import DesignPatterns.FactoryDesignPattern.WithPattern.Shape;
import DesignPatterns.FactoryDesignPattern.WithPattern.ShapeFactory;
import DesignPatterns.FactoryDesignPattern.WithPattern.Square;
import org.w3c.dom.css.Rect;

public class Test
{

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        circle.draw();
        square.draw();
        rectangle.draw();
    }

    /*
    Problem Without Factory Pattern
        When we don't use a factory pattern, we need to create objects manually using the new
        keyword everywhere. This approach tightly couples the object creation logic to the main
        program, making it less flexible and harder to maintain when new shapes are added.


     */
}
