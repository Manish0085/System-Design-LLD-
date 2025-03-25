package DesignPatterns.BuilderDesignPattern;

public class Builder {


    public String host;
    public int port = 3306;          // default for mysql
    public String username;
    public String password;
    public String dbName;
    public boolean useSSL;
    public int timeout = 30;        // default for mysql

    public Builder setHost(String host) {
        this.host = host;
        return this;
    }

    public Builder setPort(int port) {
        this.port = port;
        return this;
    }

    public Builder setUsername(String username) {
        this.username = username;
        return this;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Builder setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public Builder setUseSSL(boolean useSSL) {
        this.useSSL = useSSL;
        return this;
    }

    public Builder setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public DatabaseConnection build(){
        return new DatabaseConnection(this);
    }
}
