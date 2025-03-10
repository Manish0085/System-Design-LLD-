package SolidPrinciples.DependencyInversion.WithoutPrinciple;

import java.util.Scanner;

public class KeyBoard {

    public String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
