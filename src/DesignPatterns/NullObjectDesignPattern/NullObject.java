package DesignPatterns.NullObjectDesignPattern;

public class NullObject implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("No payment method available. Please add a payment method.");
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
