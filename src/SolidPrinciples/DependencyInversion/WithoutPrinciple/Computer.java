package SolidPrinciples.DependencyInversion.WithoutPrinciple;

public class Computer {

    private Monitor monitor;
    private KeyBoard keyBoard;

    public Computer(){
        monitor = new Monitor();
        keyBoard = new KeyBoard();
    }

    public void execute(){
        String content = keyBoard.getInput();
        monitor.displayOutput(content);
    }

    /*
    Problem :
            Here I have hardcoded the object of monitor or keyboard and fixed them but let suppose we have to
            some other input or output device then we can't change it...
     */
}
