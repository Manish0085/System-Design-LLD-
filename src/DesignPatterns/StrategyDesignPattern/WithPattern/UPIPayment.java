package DesignPatterns.StrategyDesignPattern.WithPattern;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using UPI successfully");
    }
}
