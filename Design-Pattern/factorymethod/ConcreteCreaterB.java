package factorymethod;

public class ConcreteCreaterB extends Creater {

    @Override
    public Product createProduct() {
        return new concreteProductB();
    }

}
