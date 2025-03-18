package DesignPatterns.ProxyDesignPattern;

public class Test {

    public static void main(String[] args) {
        WiFi wiFi = new WiFiProxy();

        wiFi.connect("Raman", "123456789");
        wiFi.connect("Manish", "123456789");
        wiFi.connect("Rohit", "123756789");
        wiFi.connect("Amit", "123456789");
    }
}
