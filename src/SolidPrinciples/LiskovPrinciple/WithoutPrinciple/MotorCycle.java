package SolidPrinciples.LiskovPrinciple.WithoutPrinciple;

public class MotorCycle implements Bike{

    private boolean isEngineOn = false;
    private int speed = 0;


    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed += 20;
    }
}
