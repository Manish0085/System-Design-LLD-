package SolidPrinciples.DependencyInversion.WithPrinciple;

import java.util.Scanner;

public class KeyBoard implements InputDevice{


    @Override
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
}
