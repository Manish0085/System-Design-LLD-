package DesignPatterns.PrototypeDesignPattern;

public class Invoice extends DocumentPrototype{

    String clientName;

    public Invoice(String  title, String content, String clientName){
        super(title, content);
        this.clientName = clientName;
    }
    @Override
    public void show() {
        System.out.println("Invoice - Title: " + title + ", Content: " + content + ", Client: " + clientName);
    }
}
