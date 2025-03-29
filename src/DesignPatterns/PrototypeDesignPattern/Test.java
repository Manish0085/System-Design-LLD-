package DesignPatterns.PrototypeDesignPattern;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Invoice invoice = new Invoice("Invoice Template", "Amount Due: $1000", "Client A");

        Invoice invoice1 = (Invoice) invoice.clone();
        invoice1.clientName = "Client B";

        Contract contract = new Contract("Legal Contract", "Terms & Conditions Apply", "Party X");

        Contract contract1 = (Contract) contract.clone();
        contract1.partyName = "Party B";

        invoice.show();
        invoice1.show();
        contract.show();
        contract1.show();
    }
}
