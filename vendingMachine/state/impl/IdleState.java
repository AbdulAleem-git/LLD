package vendingMachine.state.impl;

import java.util.ArrayList;

import vendingMachine.state.State;

public class IdleState  implements State{

    public IdleState(){
        System.out.println("Vending is in Idle state");
    }
    
    public IdleState(vendingMachine vendingMachine){
        System.out.println("Vending is in Idle state");
        vendingMachine.setCoinsLis(new ArrayList<>());
    }

    @Override
    public void pressInsertButton() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressInsertButton'");
    }

    @Override
    public void insertCoins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoins'");
    }

    @Override
    public void chooseProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public void getChange() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispense'");
    }

    @Override
    public void refund() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }

    @Override
    public void updateInventory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }
    
}
