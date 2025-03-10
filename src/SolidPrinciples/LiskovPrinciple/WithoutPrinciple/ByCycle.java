package SolidPrinciples.LiskovPrinciple.WithoutPrinciple;

public class ByCycle implements Bike{

    private int speed = 0;
    @Override
    public void turnOnEngine() {
        throw new RuntimeException("ByCycle doesn't have the engine....");
    }

    @Override
    public void accelerate() {
        throw new RuntimeException("ByCycle doesn't accelerate...");
    }

    /*
    Problem :
            Here ByCycle doesn't have the engine, and it is throwing the runtime exception and also
            disturbing the normal flow of the program...
     */
}
