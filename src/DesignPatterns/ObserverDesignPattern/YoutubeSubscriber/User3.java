package DesignPatterns.ObserverDesignPattern.YoutubeSubscriber;

public class User3 implements NotifySubscriber{

    private Subscribable subscribe;
    private String email;
    private String ytChannel;

    public User3(String email, Subscribable subscribe, String ytChannel){
        this.email = email;
        this.subscribe = subscribe;
        this.ytChannel = ytChannel;
    }

    @Override
    public void update() {
        sendNotification(email, ytChannel);
    }

    void sendNotification(String email, String ytChannel){
        System.out.println("Mail send to "+email+" successfully\nvideo is added to channel "+ytChannel+"...\n");
    }
}
