package DesignPatterns.ProxyDesignPattern;

public class WiFiProxy implements WiFi{

    private RealWiFi wiFi = new RealWiFi();
    private String[] AUTHENTICATED_USER = {"Rohit", "Amit", "Sumit", "Raman"};
    private String password = "123456789";


    @Override
    public void connect(String user, String password) {
        if (isAuthenticated(user, password)){
            wiFi.connect(user, password);
        }
        else {
            System.out.println("Access Denied! " + user + " is not authorized to connect to Wi-Fi.");
        }
    }

    private boolean isAuthenticated(String user, String password){
        for (String authorizedUser: AUTHENTICATED_USER){
            if (authorizedUser.equalsIgnoreCase(user) && this.password.equals(password)){
                return true;
            }
        }
        return false;
    }
}
