package SolidPrinciples.SingleResponsibility.WithPrinciple;

public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter (Invoice invoice){
        this.invoice = invoice;
    }

    public void invoicePrinter(){
        System.out.println("Invoice Printer...");
    }

    /*Solution:
            Here each class has the single responsibility so it becomes easy to maintain the codw
     */
}
