package designpatterns.chainofresponsibility;

public class Logger {
    Logger nextLogger;

    Logger(){

    }

    Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void print(String level){
        if(nextLogger != null)
            nextLogger.print(level);
    }
}
