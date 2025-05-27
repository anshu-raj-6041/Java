package Inheritance.Constructor;

// using super class constructor

// Parent Class
class Rectangle {
    // Properties
    public int length;
    public int breadth;

    // Constructor
    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

// Child Class
class Cuboid extends Rectangle {
    // Properties
    public int height;

    // Constructor
    public Cuboid() {
        height = 1;
    }

    public Cuboid(int h) {
        height = h;
    }

    public Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    // Methods
    public int volume() {
        // length, b coming from Rec class
        return (length * breadth * height);
    }
}

public class Q3_Rec {
    public static void main(String[] args) {
        // Cuboid c1 = new Cuboid();
        // Cuboid c1 = new Cuboid(10); // l=b=1
        Cuboid c1 = new Cuboid(5, 3, 15);   // super()

        System.out.println("Volume => " + c1.volume());

    }

}
