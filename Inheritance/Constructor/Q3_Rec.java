package Inheritance.Constructor;

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
        return (length * breadth * height);
    }
}

public class Q3_Rec {
    public static void main(String[] args) {
        // Cuboid C1 = new Cuboid();
        // Cuboid C1 = new Cuboid(10);
        Cuboid C1 = new Cuboid(5, 3, 15);

        System.out.println("Volume => " + C1.volume());

    }

}
