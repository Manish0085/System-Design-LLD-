package DesignPatterns.StrategyDesignPattern.WithPattern;

public class Paytm implements PaymentStrategy{


    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using Paytm successfully");
    }
}
