package DesignPatterns.NullObjectDesignPattern;

public class PayPal implements PaymentMethod{

    private String phone;

    public PayPal(String phone) {
        this.phone = phone;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " successfully using Credit Card: " + phone);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
