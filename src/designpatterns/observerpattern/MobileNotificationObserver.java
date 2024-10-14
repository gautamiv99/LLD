package designpatterns.observerpattern;

public class MobileNotificationObserver implements Observer {
    @Override
    public void update() {
        sendNotification("System is in stock. Hurry up!!");
    }

    public void sendNotification(String message){
        System.out.println(message);
    }
}
