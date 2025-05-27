package Inheritance.ThisSuper;
// super class

class Rectangle {
    // Properties
    public int length;
    public int breadth;
    public int x = 10;

    // Constructor (PC)
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    // Properties
    public int height;
    public int x = 20;

    // Constructor (PC)
    public Cuboid(int l, int b, int h) {
        // calling Parent class PC, we have to use keyword super
        super(l, b);
        height = h;
    }

    // Methods
    public void display() {
        System.out.println(super.x);    // Rec wla
        System.out.println(x);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(10, 5, 50);
        c1.display();
        
    }
    
}
