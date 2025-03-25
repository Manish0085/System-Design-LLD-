package DesignPatterns.BuilderDesignPattern;

public class Test {

    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.builder()
                .setHost("localhost")
                .setPort(3307)
                .setUsername("root")
                .setPassword("root012")
                .setDbName("mydatabase").build();

        System.out.println(connection);
    }
}
