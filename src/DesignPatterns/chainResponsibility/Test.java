package DesignPatterns.chainResponsibility;

public class Test {

    public static void main(String[] args) {
        RequestHandler logger = new InfoHandler(new DebugHandler(new WarnHandler(new ErrorHandler(null))));

        logger.log(1, "This is information message");
        logger.log(2, "This message is for debugging");
        logger.log(3, "This message is for showing error");
        logger.log(4, "This message is for giving warning");
    }
}



