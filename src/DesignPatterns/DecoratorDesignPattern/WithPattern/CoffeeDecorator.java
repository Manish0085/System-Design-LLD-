package DesignPatterns.DecoratorDesignPattern.WithPattern;

public abstract class CoffeeDecorator implements BaseCoffee {

    protected BaseCoffee coffee;

    public CoffeeDecorator(BaseCoffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int getCost() {
        return coffee.getCost();
    }
}
