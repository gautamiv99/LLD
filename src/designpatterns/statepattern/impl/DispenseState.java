package designpatterns.statepattern.impl;

import designpatterns.statepattern.State;
import designpatterns.statepattern.VendingMachine;
import designpatterns.statepattern.model.Coin;
import designpatterns.statepattern.model.Item;

import java.util.List;

public class DispenseState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Can't click on insert coin in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Can't click on start in selection state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Can't insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Can't get change in selection state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return machine.getInventory().getItems().stream().filter(o -> o.getCodeNumber() == codeNumber).findAny().get();
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Can't refund full money in selection state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Can't update inventory in selection state");
    }
}
