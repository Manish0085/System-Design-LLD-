package DesignPatterns.ObserverDesignPattern.AmazonNotifySystem;


public class EmailObserverImp implements NotificationObserver {

    private String email;
    private Observable observable;

    public EmailObserverImp(String email, Observable observable){
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMsg(email, "IPhone is in stock now. Hurry up!");
     }

    public void sendMsg(String email, String msg){
        System.out.println("Mail send to "+email);
    }
}
