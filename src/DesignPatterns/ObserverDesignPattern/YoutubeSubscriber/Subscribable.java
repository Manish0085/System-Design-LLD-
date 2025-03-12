package DesignPatterns.ObserverDesignPattern.YoutubeSubscriber;

public interface Subscribable {

    void addSubscriber(NotifySubscriber subscriber);

    void removeSubscriber(NotifySubscriber subscriber);

    void notifyUser();

    int getVideoCount();

    void setVideoCount(int data);
}
