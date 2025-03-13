package DesignPatterns.DecoratorDesignPattern.WithoutPattern;

public class Test {


    public static void main(String[] args) {
        BaseCoffee coffee = new CoffeeWithMilk();
        System.out.println(coffee.getDescription()+"\nPrice :- ₹ "+coffee.getCost());

        coffee = new CoffeeWithSugarAndMilk();
        System.out.println(coffee.getDescription()+"\nPrice :- ₹ "+coffee.getCost());

        coffee = new CoffeeWithSugar();
        System.out.println(coffee.getDescription()+"\nPrice :- ₹ "+coffee.getCost());
    }

    /*
    🔹 Problems Without the Decorator Pattern
            1️⃣ Class Explosion → Each new coffee variation requires a new class (e.g., CoffeeWithMilkAndSugar).
            2️⃣ Less Flexibility → Cannot dynamically modify coffee types at runtime.
            3️⃣ Violates Open-Closed Principle → Adding a new feature requires modifying multiple classes.
     */
}
