package DesignPatterns.FacadeDesignPattern;

public class TransactionService {

        public void transactionLog(String accountNumber, double amount){
            System.out.println("Transaction logged: $" + amount + " debited from account " + accountNumber);
        }
}
