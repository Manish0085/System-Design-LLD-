package SolidPrinciples.OpenClosedPrinciple.WithoutPrinciple;

public class Invoice {

    private String invoiceId;
    private String title;
    private double amount;

    public Invoice(String invoiceId, String title, double amount) {
        this.invoiceId = invoiceId;
        this.title = title;
        this.amount = amount;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
