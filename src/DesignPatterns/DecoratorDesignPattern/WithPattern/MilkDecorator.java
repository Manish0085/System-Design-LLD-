package DesignPatterns.DecoratorDesignPattern.WithPattern;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(BaseCoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Coffee with Milk";
    }

    @Override
    public int getCost() {
        return super.getCost() + 20;
    }
}
