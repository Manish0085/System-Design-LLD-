package SolidPrinciples.OpenClosedPrinciple.WithPrinciple;

public class WordPrinter implements InvoicePrinter{

    private Invoice invoice;

    public WordPrinter(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void printInvoice() {
        System.out.println("Print invoice in the Word format...");
    }

    /*
    Solution:
            Here we created a InvoicePrinter Interface which has a printInvoice method (abstract method) and if in
            future there may be requirement to print the invoice in any other format then instead of changing the
            existing code we can implement this interface and implement the functionality...
     */
}
