package SolidPrinciples.SingleResponsibility.WithoutPrinciple;


public class Invoice {

    private Marker marker;
    private int quantity;

    public double calculate(){
        double price = (marker.getPrice()) * quantity;
        return price;
    }

    public void saveToDb(){
        System.out.println("Print invoice to database...");
    }

    public void printInvoice(){
        System.out.println("total amount is "+calculate());
    }


    /*Problem:
            this class doesn't follow the single responsibility principle because it has
            more than one responsibility...
     */
}
