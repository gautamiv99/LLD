package designpatterns.statepattern.impl;

import designpatterns.statepattern.State;
import designpatterns.statepattern.VendingMachine;
import designpatterns.statepattern.model.Coin;
import designpatterns.statepattern.model.Item;

import java.util.List;

public class HasMoneyState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        machine.getCoins().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't choose product");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Can't get change");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't dispense product in hasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        machine.setState(new IdleState());
        return machine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }
}
