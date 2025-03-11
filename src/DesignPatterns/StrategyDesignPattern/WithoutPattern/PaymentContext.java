package DesignPatterns.StrategyDesignPattern.WithoutPattern;

import java.util.Scanner;

public class PaymentContext {

    public void makePayment(String paymentStrategy, double amount){
         if(paymentStrategy.equalsIgnoreCase("CreditCard")){
             System.out.println("Paid "+amount+" using CreditCard successfully");
         } else if (paymentStrategy.equalsIgnoreCase("Paytm")) {
             System.out.println("Paid "+amount+" using Paytm successfully");
         }
         else if (paymentStrategy.equalsIgnoreCase("PayPal")){
             System.out.println("Paid "+amount+" using PayPal successfully");
         }
         else {
             System.out.println("Invalid Payment Strategy...");
         }
    }

    /*
    🔹 Without Strategy Pattern (Problems)
        ❌ Uses bulky if-else or switch-case statements
        ❌ Violates Open-Closed Principle (hard to extend)
        ❌ Code becomes rigid and difficult to maintain
     */
}
