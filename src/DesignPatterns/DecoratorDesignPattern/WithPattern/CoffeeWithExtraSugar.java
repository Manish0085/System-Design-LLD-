package DesignPatterns.DecoratorDesignPattern.WithPattern;

public class CoffeeWithExtraSugar extends CoffeeDecorator{


    public CoffeeWithExtraSugar(BaseCoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "coffee with extra sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+5;
    }
}
