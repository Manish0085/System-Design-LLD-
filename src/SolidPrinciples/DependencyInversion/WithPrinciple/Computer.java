package SolidPrinciples.DependencyInversion.WithPrinciple;

public class Computer {

    private InputDevice input;
    private OutputDevice output;


    public Computer(InputDevice input, OutputDevice output){
        this.input = input;
        this.output = output;
    }


    public void execute(){
        String content = input.getInput();
        output.displayOutput(content);
    }

    /*
    Solution :
            Here I have created two interface InputDevice and OutputDevice and device like Monitor and Keyboard
            are implementing the inputDevice and OutputDevice interface and, In future, if we want to use other
            InputDevice and OutputDevice for the same purpose then we will be extending these interfaces without
            disturbing the already working code
    */
}
