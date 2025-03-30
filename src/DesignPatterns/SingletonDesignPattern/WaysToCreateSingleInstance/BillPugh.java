package DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance;

public class BillPugh {

    private BillPugh(){

    }

    private static class BillPughHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance(){
        return BillPughHelper.INSTANCE;
    }

    // ✅ Lazy-loaded & thread-safe without synchronization
    // ⚠️ More complex, but highly efficient

    // Use Case: Cache system where data should be initialized only when needed.
}
