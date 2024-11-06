package designpatterns.statepattern.model;

public enum Coin {
    PENNY(1),
    DIME(2),
    DOLLAR(3),
    QUARTER(4);
    private int val;

    private Coin(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }
}
