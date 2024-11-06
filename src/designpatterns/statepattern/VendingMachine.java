package designpatterns.statepattern;

import designpatterns.statepattern.impl.IdleState;
import designpatterns.statepattern.model.Coin;
import designpatterns.statepattern.model.Inventory;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State state;
    Inventory inventory;
    List<Coin> coins;

    public VendingMachine() {
        this.state = new IdleState();
        this.inventory = new Inventory();
        this.coins = new ArrayList<>();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
