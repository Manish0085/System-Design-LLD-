package DesignPatterns.FacadeDesignPattern;

public class ATMFacade {

    private AccountService accountService;
    private BalanceService balanceService;
    private DispenseService dispenseService;
    private TransactionService transactionService;


    public ATMFacade(){
        this.accountService = new AccountService();
        this.balanceService = new BalanceService();
        this.dispenseService = new DispenseService();
        this.transactionService = new TransactionService();
    }


    public void withDrawMoney(String accountNumber, double money){
        if (accountService.isAccountVerified(accountNumber)){
            if (balanceService.hasSufficientBalance(accountNumber, money)){
                dispenseService.dispense(money);
                transactionService.transactionLog(accountNumber, money);
                System.out.println("Money withdrawal successfully");
            }
            else{
                System.out.println("Insufficient Balance.\n");
            }

        }
        else {
            System.out.println("Invalid Account.\n");
        }
    }


}
