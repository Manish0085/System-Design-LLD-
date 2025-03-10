package SolidPrinciples.InterfaceSegregation.WithPrinciple;

public class Car implements Drivable{


    @Override
    public void drive() {
        System.out.println("Car is running on the ground...");
    }


    /*
    Solution:
            Here we created two interface one is Drivable and Flyable and both has the functionality like
            drive and fly respectively and the class which need the functionality will bw extending that
            interface and if any class need all the functionality that class will be implementing all the
            interface and implements there method, by doing the same we don't have to implement the unneccessary
            method which the class doesn't need...
            */
}
