package designpatterns.chainofresponsibility;

public class DebugLogger extends Logger{

    public DebugLogger() {
        super();
    }

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void print(String level){
        if(level == "DEBUG")
            System.out.println("Debug log :");
        else
            super.print(level);
    }
}
