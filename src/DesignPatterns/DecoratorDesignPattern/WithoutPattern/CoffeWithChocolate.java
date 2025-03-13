package DesignPatterns.DecoratorDesignPattern.WithoutPattern;

public class CoffeWithChocolate extends BaseCoffee{

    @Override
    public String getDescription() {
        return super.getDescription()+" with chocolate";
    }

    @Override
    public int getCost() {
        return super.getCost()+ 25;
    }
}
