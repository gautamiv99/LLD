package designpatterns.chainofresponsibility;

public class LogProcessor {
    public static void main(String[] args){
        Logger logger = new InfoLogger(new DebugLogger(new StackTraceLogger()));
        logger.print("DEBUG");
    }
}
