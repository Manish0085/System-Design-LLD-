package DesignPatterns.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String name;
    private List<FileSystem> fileSystemList;

    public Directory(String name){
        this.name = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem item){
        fileSystemList.add(item);
    }

    public void remove(FileSystem item){
        fileSystemList.remove(item);
    }


    @Override
    public void ls() {
        System.out.println("Directory: "+name+" created");

        for (FileSystem system: fileSystemList){
            system.ls();
        }
    }
}
