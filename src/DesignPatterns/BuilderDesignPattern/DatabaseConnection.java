package DesignPatterns.BuilderDesignPattern;

public class DatabaseConnection
{

    private String host;
    private int port;
    private String username;
    private String password;
    private String dbName;
    private boolean useSSL;
    private int timeout;

    public DatabaseConnection(Builder builder){
        this.host = builder.host;
        this.port = builder.port;
        this.username = builder.username;
        this.password = builder.password;
        this.dbName = builder.dbName;
        this.useSSL = builder.useSSL;
        this.timeout = builder.timeout;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dbName='" + dbName + '\'' +
                ", useSSL=" + useSSL +
                ", timeout=" + timeout +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
}
