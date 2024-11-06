package designpatterns.statepattern.impl;

import designpatterns.statepattern.State;
import designpatterns.statepattern.VendingMachine;
import designpatterns.statepattern.model.Coin;
import designpatterns.statepattern.model.Item;

import java.util.List;

public class IdleState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("You need to insert coins first");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Coins can't be added in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't choose product in this state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Can't get change in this state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't dispense in this state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Can't refund money in this state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().getItems().add(item);
    }
}
