package DesignPatterns.SingletonDesignPattern.Example;

import DesignPatterns.SingletonDesignPattern.WaysToCreateSingleInstance.UsingEnum;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class CreateDBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;
    private static CreateDBConnection instance;

    private CreateDBConnection(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static CreateDBConnection getInstance(){
        if (instance == null){
            synchronized (CreateDBConnection.class){
                if (instance == null){
                    instance = new CreateDBConnection();
                }
            }
        }
        System.out.println("Instance created");
        return instance;
    }
}
