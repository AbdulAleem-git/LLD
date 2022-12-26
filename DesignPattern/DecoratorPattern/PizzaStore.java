import BaseProduct.BasePizza;
import BaseProduct.Farmhouse;
// import BaseProduct.Margherita;
import ProductTopping.ExtraCheese;
import ProductTopping.Mushroom;
public class PizzaStore {
    public static void main(String[] args) {
        BasePizza pizza =  new ExtraCheese(new Mushroom(new Farmhouse()));

        System.out.println(pizza.cost());
    }
}
