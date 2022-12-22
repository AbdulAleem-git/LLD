package java;
class SOLID_SRP_Marker {
    String name;
    int price;
    String color;
    int year;
    SOLID_SRP_Marker(String name , String color, int price, int year){
        this.name = name;
        this.price = price;
        this.color = color;
        this.year = year;
    }
}


// This violating open close principals because in future we want to save this file to some other space 
// then we will have to change this file.
// other class
class InvoiceDAO {
    public void saveToDB(){
        // Save to DB
    }
    public void saveToFile(){
        // Save to DB
    }
}

// we can improve this design by creating one interface that will have one method save like this

interface InvoiceDAO_int{
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDAO_int{
    @Override
    public void save(Invoice invoice){
        // save to DB
    }

}

class FileInvoiceDao implements InvoiceDAO_int{

    @Override
    public void save(Invoice invoice) {
        // save to file
        
    }
    
}