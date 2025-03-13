package DesignPatterns.DecoratorDesignPattern.WithoutPattern;

public class CoffeeWithSugar extends BaseCoffee
{

    @Override
    public String getDescription() {
        return super.getDescription()+" with extra sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+ 5;
    }
}
