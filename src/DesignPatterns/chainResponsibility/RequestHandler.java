package DesignPatterns.chainResponsibility;

public abstract class RequestHandler {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    public static int WARN = 4;

    RequestHandler nextRequestHandler;

    public RequestHandler(RequestHandler requestHandler){
        this.nextRequestHandler = requestHandler;
    }


    public void log(int logLevel, String msg){
        if (nextRequestHandler != null){
            nextRequestHandler.log(logLevel, msg);
        }
    }
}
