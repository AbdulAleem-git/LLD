package vendingMachine;

public class Item {
    ItemType type;
    int price;

    Item(ItemType type, int price){
        this.type = type;
        this.price = price;
    }
}
