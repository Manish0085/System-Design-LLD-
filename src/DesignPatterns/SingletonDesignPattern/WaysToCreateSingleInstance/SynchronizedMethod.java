package DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance;

public class SynchronizedMethod {

    private static SynchronizedMethod instance;

    private SynchronizedMethod(){

    }

    public static synchronized SynchronizedMethod getInstance(){
        if (instance == null){
            instance = new SynchronizedMethod();
        }
        return instance;
    }

    // ✅ Thread-safe, prevents multiple instances
    //⚠️ Slow performance due to method synchronization

    //Use Case: File manager that ensures a single instance controls access to files.
}
