package DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance;

public class LazyInitialization
{

    private static LazyInitialization instance;

    private LazyInitialization(){

    }

    public static LazyInitialization getInstance(){
        if (instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

    // Instance is created only when required
    // Not thread-safe (multiple threads may create multiple instances)

    // Use Case: Configuration management that may not be required at startup..
}
