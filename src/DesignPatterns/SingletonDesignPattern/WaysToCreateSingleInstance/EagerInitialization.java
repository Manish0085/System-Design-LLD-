package DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance;

public class EagerInitialization {


    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return instance;
    }

    //Best when instance is always needed
    //Created even if not used, wastes memory
    //Use Case: Logging system where a single logger instance is always required.
}
