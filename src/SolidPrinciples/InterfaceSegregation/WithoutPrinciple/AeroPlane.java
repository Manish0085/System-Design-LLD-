package SolidPrinciples.InterfaceSegregation.WithoutPrinciple;

public class AeroPlane implements Vehicle{
    @Override
    public void drive() {
        System.out.println("AeroPlane is running on the ground...");
    }

    @Override
    public void fly() {
        System.out.println("Now the aeroplane is flying in the sky...");
    }
}
