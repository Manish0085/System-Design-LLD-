package DesignPatterns.NullObjectDesignPattern;

public class Paytm implements PaymentMethod{

    private String phone;

    public Paytm(String phone) {
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
