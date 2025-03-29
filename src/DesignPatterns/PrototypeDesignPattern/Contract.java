package DesignPatterns.PrototypeDesignPattern;

public class Contract extends DocumentPrototype{

    String partyName;

    public Contract(String title, String content, String partyName) {
        super(title, content);
        this.partyName = partyName;
    }



    @Override
    public void show() {
        System.out.println("Contract - Title: " + title + ", Content: " + content + ", Party: " + partyName);
    }
}
