package designpatterns.observerpattern;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

    void setStockCount(int t);

    int getStockCount();
}
