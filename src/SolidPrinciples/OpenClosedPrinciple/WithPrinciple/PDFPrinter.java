package SolidPrinciples.OpenClosedPrinciple.WithPrinciple;

public class PDFPrinter implements InvoicePrinter{

    private Invoice invoice;

    public PDFPrinter(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void printInvoice() {
        System.out.println("Print invoice in the PDF format...");
    }
}
