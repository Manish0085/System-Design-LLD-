package SolidPrinciples.LiskovPrinciple.WithPrinciple;

public class MotorCar implements EngineVehicle{

    private boolean isEngineOn = false;
    private int speed = 0;


    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed += 25;
    }
}
