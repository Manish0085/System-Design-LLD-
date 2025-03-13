package DesignPatterns.DecoratorDesignPattern.WithoutPattern;

public class CoffeeWithMilk extends BaseCoffee{

    @Override
    public String getDescription() {
        return super.getDescription()+" with milk";
    }

    @Override
    public int getCost() {
        return super.getCost() + 10;
    }
}
