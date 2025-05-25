package OOPS.Constructor;

// Constructor is a method of a class which is called automatically whenever 
// we are creating object
// Two types of constructor 1>Non-Parameterised 2>Parameterised
// Constructor is a method which has same name as class name ***
// do not have return type ***
// usually public but they can be make private

class Rectangle {
    // Properties
    private double length;
    private double breadth;

    // Constructor (Non-Parameterised)
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterised Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double s) {
        length = breadth = s;
    }

    // Methods
    public double area() {
        return (length * breadth);
    }

}

public class Q1_Rec {
    public static void main(String[] args) {
        // Object creation using Non-Parameterised Constructor
        // Rectangle r1 = new Rectangle();

        // Object creation using Parameterised Constructor
        // Rectangle r1 = new Rectangle(10, 5);

        // third wla
        Rectangle r1 = new Rectangle(10);

        System.out.println("Area => " + r1.area());

    }

}
