package SolidPrinciples.SingleResponsibility.WithPrinciple;

public class InvoiceDao {

    private Invoice invoice;

    public InvoiceDao (Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDb(){
        System.out.println("Print invoice to database...");
    }
}
