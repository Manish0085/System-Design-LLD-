package DesignPatterns.NullObjectDesignPattern;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        PaymentMethod transaction1 = PaymentFactory.getPaymentMethod("user145");
        PaymentMethod transaction2 = PaymentFactory.getPaymentMethod("user1");
        transaction2.pay(1000);
//        transaction1.pay(2000);
    }
}
