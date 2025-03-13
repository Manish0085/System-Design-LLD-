package DesignPatterns.DecoratorDesignPattern.WithPattern;

public class Test {

    public static void main(String[] args) {
        BaseCoffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+"\n"+"Price :- ₹ "+coffee.getCost());

        coffee = new CoffeeWithExtraSugar(coffee);
        System.out.println(coffee.getDescription()+"\n"+"Price :- ₹ "+coffee.getCost());

        coffee = new ChocolateCoffee(new SimpleCoffee());
        System.out.println(coffee.getDescription()+"\n"+"Price :- ₹ "+coffee.getCost());

        coffee = new ChocolateCoffee(coffee);
        System.out.println(coffee.getDescription()+"\n"+"Price :- ₹ "+coffee.getCost());
    }

}
