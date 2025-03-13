package DesignPatterns.DecoratorDesignPattern.WithPattern;

public class SimpleCoffee implements BaseCoffee{
    @Override
    public String getDescription() {
        return "Simple Coffee ";
    }

    @Override
    public int getCost() {
        return 35;
    }
}
