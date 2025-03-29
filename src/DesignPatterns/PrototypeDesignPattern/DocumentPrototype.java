package DesignPatterns.PrototypeDesignPattern;

import java.io.StringReader;

public abstract class DocumentPrototype implements Cloneable{

     String title;
     String content;


    public DocumentPrototype(String title, String content){
        this.title = title;
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void show();
}
