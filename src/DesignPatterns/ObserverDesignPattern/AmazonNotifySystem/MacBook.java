package DesignPatterns.ObserverDesignPattern.AmazonNotifySystem;

import java.util.ArrayList;
import java.util.List;

public class MacBook implements Observable{

    List<NotificationObserver> stock = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void addObserver(NotificationObserver observer) {
        stock.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        stock.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (NotificationObserver observer : stock){
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int items) {
        if(stockCount == 0){
            notifyObserver();
        }
        stockCount += items;
    }
}
