package DesignPatterns.chainResponsibility;

public class DebugHandler extends RequestHandler{


    public DebugHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: "+msg);;
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
