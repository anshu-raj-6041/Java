package OOPS.Constructor;

class Product {
    // Properties
    private String itemNo; // alphaNumeric(A25-76)
    private String name;
    private double price;
    private int qty;

    // constructor
    public Product() {
        itemNo = "A25-76";
        name = "Maggi";
    }

    public Product(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;
    }

    // getter and setter (property methods)
    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // setter
    // we can't change itemNo
    // we can't change name
    public void setPrice(double p) {
        price = p;
    }

    public void setQty(int q) {
        qty = q;
    }

    // instance methods
    public String toString() {
        return "Item No: " + itemNo + ", Price: " + price + ", Name: " + name
                + ", Quantity: " + qty;
    }

    public String details() {
        return "Item No: " + itemNo + ", Price: " + price + ", Name: " + name
                + ", Quantity: " + qty;
    }

}

public class Q3_Product {
    public static void main(String[] args) {
        Product P1 = new Product();

        P1.setPrice(50);
        P1.setQty(5);

        System.out.println("Product Details => " + P1);
        System.out.println("Product Details => " + P1.details());

    }

}
