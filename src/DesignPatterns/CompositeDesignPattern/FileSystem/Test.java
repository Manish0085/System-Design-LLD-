package DesignPatterns.CompositeDesignPattern.FileSystem;

public class Test {

    public static void main(String[] args) {

        FileSystem file1 = new File("image.jpg");
        FileSystem file2 = new File("doc.txt");
        FileSystem file3 = new File("Hello.java");


        Directory dir1 = new Directory("Temporary");
        dir1.add(file1);
        dir1.add(file3);
        Directory dir2 = new Directory("Code");
        dir2.add(file2);
        Directory rootDir = new Directory("Root");
        rootDir.add(dir1);
        rootDir.add(dir2);
        rootDir.ls();



//                                Root
//                                /   \
//                               /     \
//                      Temporary       Code
//                       /    \          /
//                  file1     file3     file2

    }
}
