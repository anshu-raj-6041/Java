package Inheritance.ThisSuper;

class Rectangle {
    // Properties
    public int length;
    public int breadth;
    public int x = 10;

    // Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    // Properties
    public int height;
    public int x = 20;

    // Constructor
    public Cuboid(int l, int b, int h) {
        // calling Parent class PC
        super(l, b);
        height = h;
    }

    // Methods
    public void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Cuboid C1 = new Cuboid(10, 5, 50);
        C1.display();
        
    }
    
}
