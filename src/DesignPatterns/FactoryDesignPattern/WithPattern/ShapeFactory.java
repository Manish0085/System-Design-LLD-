package DesignPatterns.FactoryDesignPattern.WithPattern;

public class ShapeFactory {

    public Shape getShape(String type){

        return switch (type) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> {
                System.out.println("Invalid type");
                yield null;
            }
        };
    }
}
