package DesignPatterns.DecoratorDesignPattern.WithPattern;

public class ChocolateCoffee extends CoffeeDecorator{
    public ChocolateCoffee(BaseCoffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost()+50;
    }

    @Override
    public String getDescription() {
        return "Chocolate Coffee";
    }
}
