package Inheritance;

// Parent class
class Rectangle {
    // Properties
    public int length;
    public int breadth;

    // Methods
    public int area() {
        return (length * breadth);
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Cuboid extends Rectangle {
    // Properties
    public int height;

    // Methods
    public int volume() {
        return area() * height;
    }
}

// Child class
public class Q2a_RecCub {
    public static void main(String[] args) {
        Cuboid C1 = new Cuboid();

        C1.length = 5;
        C1.breadth = 5;
        C1.height = 5;

        System.out.println("Area => " + C1.area());
        System.out.println("Volume => " + C1.volume());

    }

}
