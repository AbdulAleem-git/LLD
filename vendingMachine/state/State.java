package vendingMachine.state;

public interface State {
    public void pressInsertButton();
    public void insertCoins();
    public void chooseProduct();
    public void getChange();
    public void dispense();
    public void refund();
    public void updateInventory();
}
