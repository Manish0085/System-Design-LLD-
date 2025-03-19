package DesignPatterns.NullObjectDesignPattern;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    public CreditCard(String cardNumber) { this.cardNumber = cardNumber; }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " successfully using Credit Card: " + cardNumber);
    }

    @Override
    public boolean isNull() { return false; }
}
