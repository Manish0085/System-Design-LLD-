package DesignPatterns.chainResponsibility;

public class InfoHandler extends RequestHandler{


    public InfoHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == INFO){
            System.out.println("INFO: "+msg);
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
