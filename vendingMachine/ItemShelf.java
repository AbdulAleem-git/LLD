package vendingMachine;
public class ItemShelf {
    Item name ;
    int code;
    boolean isAvailable;
    ItemShelf(Item item, int code , boolean isAvailable){
        this.name = item;
        this.code = code;
        this.isAvailable = isAvailable;
    }
}
