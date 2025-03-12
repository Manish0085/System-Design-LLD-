package DesignPatterns.ObserverDesignPattern.AmazonNotifySystem;

public class Main {

    public static void main(String[] args) {

        Observable observable1 = new MacBook();
        Observable observable2 = new IPhoneObservableImp();

        NotificationObserver observer1 = new MobileObserverImp("+1234567890", observable1);
        NotificationObserver observer2 = new MobileObserverImp("+7415230011", observable1);
        NotificationObserver observer3 = new MobileObserverImp("+8474000498", observable2);
        NotificationObserver observer4 = new EmailObserverImp("xyz1@gmail.com", observable2);
        NotificationObserver observer5 = new MobileObserverImp("xyz2@gmail.com", observable1);

        observable1.addObserver(observer1);
        observable2.addObserver(observer3);
        observable2.addObserver(observer2);
        observable2.addObserver(observer5);
        observable1.addObserver(observer4);;

        observable1.setStockCount(5);
        observable1.setStockCount(0);
        observable1.setStockCount(5);

        System.out.println(observable1.getStockCount());
        observable1.setStockCount(5);
        observable2.setStockCount(5);

    }
}
