package DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance;

public enum UsingEnum {

    INSTANCE;

    public void shoe(){
        System.out.println("Single instance of class created");
    }


    // ✅ Serialization-safe & thread-safe without locks
    // ⚠️ Limited flexibility (doesn’t support lazy initialization)

    //  Use Case: Managing global application settings like environment configurations.

}
