package SolidPrinciples.SingleResponsibility.WithPrinciple;

public class Invoice {

    private Marker marker;
    private int quantity;

    public double calculate(){
        double price = (marker.getPrice()) * quantity;
        return price;
    }

}
