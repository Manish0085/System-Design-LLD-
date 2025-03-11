package DesignPatterns.StrategyDesignPattern.WithoutPattern;

public class PaymentSystemWithoutStrategyPattern {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        //using CreditCard
        context.makePayment("CreditCard", 1000);

        //using Paytm
        context.makePayment("Paytm", 1250);

        //using PayPal
        context.makePayment("PayPal", 751);
    }
}
