package OOPS.Constructor;

// Constructor is a method of a class which is called automatically whenever 
// we are creating object
// Two types of constructor 1>Non-Parameterised 2>Parameterised
// Constructor is a method which has same name as class name 
// do not have return type
// usually public

class Rectangle {
    // Properties
    private double length;
    private double breadth;

    // Constructor (Non-Parameterised)
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterised
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Methods
    public double area() {
        return (length * breadth);
    }

}

public class Rec_1 {
    public static void main(String[] args) {
        // Object creation using Non-Parameterised
        Rectangle R1 = new Rectangle();

        // Object creation using Parameterised constructor
        // Rectangle R1 = new Rectangle(10, 5);

        System.out.println("Area => " + R1.area());

    }

}
