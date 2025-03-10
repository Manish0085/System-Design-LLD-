package SolidPrinciples.OpenClosedPrinciple.WithPrinciple;

public class EXCELPrinter implements InvoicePrinter{

    private Invoice invoice;

    public EXCELPrinter(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void printInvoice() {
        System.out.println("Print invoice in the excel format...");
    }
}
