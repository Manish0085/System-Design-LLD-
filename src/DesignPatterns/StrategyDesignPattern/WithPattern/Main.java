package DesignPatterns.StrategyDesignPattern.WithPattern;

public class Main {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        //using Paytm
        context.setPaymentStrategy(new Paytm());
        context.makePayment(1000);

        //using PayPal
        context.setPaymentStrategy(new PayPal());
        context.makePayment(750);

        //using Paytm
        context.setPaymentStrategy(new CreditCard());
        context.makePayment(7200);
    }

    /*
    🔹 With Strategy Pattern (Solution)
        ✅ Removes conditional logic
        ✅ Allows dynamic selection of payment methods
        ✅ Follows SOLID principles (Open-Closed Principle)
        ✅ Improves flexibility & maintainability
     */
}
