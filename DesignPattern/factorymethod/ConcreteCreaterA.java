package factorymethod;

public class ConcreteCreaterA extends Creater {

    @Override
    public Product createProduct() {
        return new concreteProductA();
    }
    
}
