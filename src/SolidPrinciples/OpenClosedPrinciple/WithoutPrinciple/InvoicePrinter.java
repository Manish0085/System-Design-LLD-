package SolidPrinciples.OpenClosedPrinciple.WithoutPrinciple;

import java.util.Scanner;

public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the formate in which the invoice to be printed...");
        String format = sc.nextLine();
        if(format.equalsIgnoreCase("PFF")){
            System.out.println("Print the invoice in the PDF format...");
        }
        else if(format.equalsIgnoreCase("EXCEL")){
            System.out.println("Print the invoice in the excel format...");
        }
        else {
            System.out.println("The format you entered is not correct");
        }
    }

     /*
    Problem :
            suppose if you add the functionality to print the invoice in the form of
            word file also then you should not change the already working code
     */
}
