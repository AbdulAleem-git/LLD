package java;
// The problem with this interface is this is having multiple irrelevent methods
// now lets say if there is a waiter who is employee of this restaurant
// then he will also implement the washDishes() which is irrelevent for the
// waiter.
interface SOLID_Interface_Segment_RetaurantEmployee {
    void washDishes();
    void serveCustomer();
    void cookFood();
}

class Waiter implements SOLID_Interface_Segment_RetaurantEmployee{

    @Override
    public void cookFood() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void serveCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void washDishes() {
        // TODO Auto-generated method stub
        
    }
    
}
// solution for the above problem 
//  break the interface like this

interface WaiterInterface {
    void serveCustomer();
    void takeOrder();
}

interface ChefInterface {
    void cookFood();
    void decideMenu();
}

interface HelperInterface {
    void washDishes();
    void cleanTable();
}