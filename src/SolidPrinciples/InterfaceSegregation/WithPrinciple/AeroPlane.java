package SolidPrinciples.InterfaceSegregation.WithPrinciple;

public class AeroPlane implements Flyable, Drivable{
    @Override
    public void drive() {
        System.out.println("Aeroplane is running on the ground...");
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane is flying in the sky...");
    }
}
