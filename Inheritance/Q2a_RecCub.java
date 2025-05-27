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
        Cuboid c1 = new Cuboid();

        c1.length = 5;
        c1.breadth = 5;
        c1.height = 5;

        System.out.println("Area => " + c1.area());
        System.out.println("Volume => " + c1.volume());

    }

}
