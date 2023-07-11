package vendingMachine;

import java.util.List;

import vendingMachine.state.State;

public class vendingMachine {
    State vendingMachineState;
    Inventory inventory;
    List<Coin> coins;

    
    public List<Coin> getCoins() {
        return coins;
    }
    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
    public State getVendingMachineState() {
        return vendingMachineState;
    }
    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
    
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }     
}
