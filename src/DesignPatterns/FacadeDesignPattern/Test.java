package DesignPatterns.FacadeDesignPattern;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter the amount to be withdrawal ");
        double amount = sc.nextDouble();

        ATMFacade atm = new ATMFacade();
        atm.withDrawMoney(accountNumber, amount);


    }
}
