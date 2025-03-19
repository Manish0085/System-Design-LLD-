package DesignPatterns.NullObjectDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

    private static final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    static {
        // Mock database of users and their payment methods
        paymentMethods.put("user1", new CreditCard("1234-5678-9876-5432"));
        paymentMethods.put("user2", new PayPal("user2@example.com"));
    }

    public static PaymentMethod getPaymentMethod(String userId) {
        return paymentMethods.getOrDefault(userId, new NullObject());
    }
}
