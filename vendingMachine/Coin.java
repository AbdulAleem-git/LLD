package vendingMachine;

public enum Coin {
    PENNY(1),
    NICKLE(1),
    DIME(1),
    QUARTER(5);

    public int value;

    Coin(int value){
        this.value = value;
    }

}
