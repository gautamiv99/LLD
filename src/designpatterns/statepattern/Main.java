package designpatterns.statepattern;

import designpatterns.statepattern.model.Coin;
import designpatterns.statepattern.model.Inventory;
import designpatterns.statepattern.model.Item;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Inventory inventory = new Inventory();
        Item item1 = new Item(1, "Coke", 30);
        Item item2 = new Item(2, "Pepsi", 40);
        Item item3 = new Item(3, "Cola", 30);
        inventory.getItems().add(item1);
        inventory.getItems().add(item2);
        inventory.getItems().add(item3);
        machine.setInventory(inventory);

        try {
            machine.getState().clickOnInsertCoinButton(machine);

            machine.getState().insertCoin(machine, Coin.DOLLAR);
            machine.getState().insertCoin(machine, Coin.QUARTER);

            machine.getState().clickOnStartProductSelectionButton(machine);

            machine.getState().chooseProduct(machine, 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
