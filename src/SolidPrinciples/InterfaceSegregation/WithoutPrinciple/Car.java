package SolidPrinciples.InterfaceSegregation.WithoutPrinciple;

public class Car implements Vehicle{


    @Override
    public void drive() {
        System.out.println("Car is running on ground...");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Car doesn't fly in the sky");
    }


    /*
    Problem:
            Here the Car class is implementing the Vehicle interface and, also it has to implement the fly
            interface which is defined in the Vehicle interface and even the car doesn't have the capability
             of flying...
     */
}
