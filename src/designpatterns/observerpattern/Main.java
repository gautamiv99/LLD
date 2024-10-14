package designpatterns.observerpattern;

public class Main {
    public static void main(String[] args){
        IphoneObservable iphoneObservable = new IphoneObservable();
        iphoneObservable.add(new EmailAlertObserver());
        iphoneObservable.add(new MobileNotificationObserver());

        iphoneObservable.setStockCount(3);
    }
}
