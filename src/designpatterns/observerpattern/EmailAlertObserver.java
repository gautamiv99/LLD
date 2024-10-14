package designpatterns.observerpattern;

public class EmailAlertObserver implements Observer{

    @Override
    public void update() {
        sendMail("System is in stock. Hurry up!!");
    }

    public void sendMail(String message){
        System.out.println(message);
    }
}
