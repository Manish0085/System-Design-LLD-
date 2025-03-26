package DesignPatterns.FacadeDesignPattern;

public class AccountService {

    public boolean isAccountVerified(String accountNumber){
        System.out.println("Verifying account "+accountNumber);
        return accountNumber.length()==12;
    }
}
