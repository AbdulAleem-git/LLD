package java;
// Open for extention closed for modification 
public class SOLID_Open_Close_Marker {
    String name;
    int price;
    String color;
    int year;
    SOLID_Open_Close_Marker(String name , String color, int price, int year){
        this.name = name;
        this.price = price;
        this.color = color;
        this.year = year;
    }
}


// HAS -A relationship
// This class is having mulitple responsiblity
class Invoice {
    SOLID_SRP_Marker marker ;
    int quantity;
    public Invoice(SOLID_SRP_Marker marker, int quantity){
        this.marker = marker;
        this.quantity  = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice() {
        // print the invoice
    }

    public void saveToDB(){
        // Save to DB
    }
}

// we can break this class into  multiple classes
class InvoicePrinter{
    public void printInvoice() {
        // print the invoice
    }
}

// other class
class InvoiceDAO {
    public void saveToDB(){
        // Save to DB
    }
}