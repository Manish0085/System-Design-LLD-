package DesignPatterns.chainResponsibility;

public class ErrorHandler extends RequestHandler{


    public ErrorHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == ERROR){
            System.out.println("ERROR: "+msg);
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
