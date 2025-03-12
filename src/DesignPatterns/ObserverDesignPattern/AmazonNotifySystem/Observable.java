package DesignPatterns.ObserverDesignPattern.AmazonNotifySystem;

public interface Observable {

    void addObserver(NotificationObserver observer);

    void removeObserver(NotificationObserver observer);

    void notifyObserver();

    int getStockCount();

    void setStockCount(int items);
}
