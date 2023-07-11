package vendingMachine;

import java.util.List;
public class Inventory {
    List<ItemShelf> items;

    public Inventory(List<ItemShelf> items) {
        this.items = items;
    }

    public void initialize(){
        // Put cock
        int shelfcode = 100 ;
        for(int i = 0 ; i < 3 ; i++){
            Item item = new Item(ItemType.COCK, 10);
            ItemShelf shelf = new ItemShelf(item, shelfcode++, true);
            items.add(shelf);
        }
        //put sting
        for(int i = 0 ; i < 3 ; i++){
            Item item = new Item(ItemType.STING, 20);
            ItemShelf shelf = new ItemShelf(item, shelfcode++, true);
            items.add(shelf);
        }
        // put redbull
        for(int i = 0 ; i < 4 ; i++){
            Item item = new Item(ItemType.REDBULL, 70);
            ItemShelf shelf = new ItemShelf(item, shelfcode++, true);
            items.add(shelf);
        }
    }


}
