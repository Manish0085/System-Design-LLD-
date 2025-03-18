package DesignPatterns.ProxyDesignPattern;

public class RealWiFi implements WiFi{


    @Override
    public void connect(String user, String password) {
        System.out.println(user + " is connected to Wi-Fi successfully.");
    }
}
