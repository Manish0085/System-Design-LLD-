package DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance;

public class DoubleCheckedLocking
{

    private static DoubleCheckedLocking instance;

    private DoubleCheckedLocking(){

    }

    public static DoubleCheckedLocking getInstance(){
        if (instance == null){
            synchronized (DoubleCheckedLocking.class){
                if (instance == null){
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    // ✅ Thread-safe & efficient (synchronization happens only once)
    // ⚠️ Requires volatile keyword for consistency

    // Use Case: Database connection pool to optimize resource utilization.
}
