package DesignPatterns.FacadeDesignPattern;

public class BalanceService {

    public boolean hasSufficientBalance(String accountNumber, double amount){
        System.out.println("Checking balance for account "+accountNumber);
        return amount <= 2000;
    }
}

