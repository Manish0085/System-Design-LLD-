package DesignPatterns.FactoryDesignPattern.WithPattern;

public class Test
{

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
