package DesignPatterns.chainResponsibility;

public class WarnHandler extends RequestHandler{


    public WarnHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel ==WARN){
            System.out.println("WARN: "+msg);
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
