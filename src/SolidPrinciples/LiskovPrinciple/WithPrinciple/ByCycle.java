package SolidPrinciples.LiskovPrinciple.WithPrinciple;

public class ByCycle implements NonEngineVehicle{

    @Override
    public void rideNonEngineVehicle() {
        System.out.println("Ride the Bycycle...");
    }


}
