package designpatterns.chainofresponsibility;

public class InfoLogger extends Logger {

    public InfoLogger() {
        super();
    }

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void print(String level){
        if(level == "INFO")
            System.out.println("Info level log :");
        else
            super.print(level);
    }
}
