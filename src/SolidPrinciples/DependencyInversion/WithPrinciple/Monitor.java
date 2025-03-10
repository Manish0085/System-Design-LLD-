package SolidPrinciples.DependencyInversion.WithPrinciple;

public class Monitor implements OutputDevice{


    @Override
    public void displayOutput(String content) {
        System.out.println("USer entered "+content);
    }
}
