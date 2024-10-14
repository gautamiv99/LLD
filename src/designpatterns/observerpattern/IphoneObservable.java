package designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    List<Observer> observers = new ArrayList<>();

    public int stockCount = 0;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int t) {
        if(stockCount == 0)
            notifyObservers();
        this.stockCount = t;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
