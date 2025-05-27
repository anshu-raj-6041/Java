package Inheritance.ThisSuper;

// this and super
// this is ref to current object

class Rectangle {
    // Properties
    public int length;
    public int breadth;

    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // public Rectangle(int l, int b) {
    //     this.length = l;
    //     this.breadth = b;
    // }

    // Methods
    public void display() {
        System.out.println("Length => "+this.length);
        System.out.println("Breadth => "+this.breadth);
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(20, 10);

        // r1.display();
        r2.display();
        
    }
    
}
