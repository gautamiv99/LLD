package designpatterns.statepattern.model;

public class Item {
    int codeNumber;
    String name;
    int cost;

    public Item(int codeNumber, String name, int cost) {
        this.codeNumber = codeNumber;
        this.name = name;
        this.cost = cost;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
