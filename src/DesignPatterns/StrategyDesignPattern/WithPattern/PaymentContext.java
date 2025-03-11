package DesignPatterns.StrategyDesignPattern.WithPattern;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void makePayment(double amount){
        paymentStrategy.pay(amount);
    }
}
