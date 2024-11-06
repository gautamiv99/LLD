package designpatterns.statepattern.impl;

import designpatterns.statepattern.State;
import designpatterns.statepattern.VendingMachine;
import designpatterns.statepattern.model.Coin;
import designpatterns.statepattern.model.Item;

import java.util.List;
import java.util.Optional;

public class SelectionState implements State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Can't click on insert coin button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Can't insert coin this state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Optional<Item> item = machine.getInventory().getItems().stream().filter(o -> o.getCodeNumber() == codeNumber).findAny();
        int amountPaid = 0;

        List<Coin> coins = machine.getCoins();
        for(Coin coin : coins){
            amountPaid += coin.getVal();
        }

        if(item.isPresent()){
            if(amountPaid < item.get().getCost()) {
                refundFullMoney(machine);
                throw new Exception("Insufficient amount");
            }else{
                if(amountPaid > item.get().getCost())
                    getChange(amountPaid - item.get().getCost());
                machine.setState(new DispenseState());
                machine.getState().dispenseProduct(machine, codeNumber);
            }
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't dispense in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        machine.setState(new IdleState());
        return machine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
