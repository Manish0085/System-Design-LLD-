package DesignPatterns.DecoratorDesignPattern.WithoutPattern;

public class CoffeeWithSugarAndMilk extends BaseCoffee{

    @Override
    public String getDescription() {
        return super.getDescription()+" with milk and sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+25;
    }
}
