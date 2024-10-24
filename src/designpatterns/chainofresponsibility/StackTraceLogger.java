package designpatterns.chainofresponsibility;

public class StackTraceLogger extends Logger {

    public StackTraceLogger() {
        super();
    }

    public StackTraceLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void print(String level){
        if(level == "STACKTRACE")
            System.out.println("Stack level log :");
        else
            super.print(level);
    }
}
