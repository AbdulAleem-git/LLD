package vendingMachine;

public enum ItemType {
    PEPSI(10),
    COCK(10),
    STING(20),
    REDBULL(70);

    int price;

    ItemType(int price){
        this.price = price;
    }
    
}
