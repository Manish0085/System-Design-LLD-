package DesignPatterns.ObserverDesignPattern.AmazonNotifySystem;

public class MobileObserverImp implements NotificationObserver{

    private String phone;
    private Observable observable;

    public MobileObserverImp(String email, Observable observable){
        this.phone = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsg(phone, "IPhone is in stock now. Hurry up!");
    }

    public void sendMsg(String email, String msg){
        System.out.println("Msg send to "+email);
    }
}
