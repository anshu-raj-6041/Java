package Inheritance;

// Parent class/ Super class
class Circle {
    // Properties
    public double radius;

    // Constructor (Non-Parameterised)
    // public Circle() {
    //     radius = 10;
    // }

    // Methods
    public double area() {
        return (Math.PI*radius*radius);
    }
    public double perimeter() {
        return (2*Math.PI*radius);
    }
    public double circumference() {
        return perimeter();
    }

}
// Child class/ Sub class
// extends :: everything from Circle class is av in Cy class but not access
class Cylinder extends Circle {
    // Properties
    public double height;

    // Constructor
    // public Cylinder() {
    //     height = 5;
    // }

    // Methods
    public double volume() {
        // return ((Math.PI*radius*radius)*height);
        return (area()*height);
    }
}

public class Q2_CircleCy {
    public static void main(String[] args) {
        // Object creation
        // Circle C1 = new Circle();
        Cylinder C2 = new Cylinder();

        C2.radius = 10;
        C2.height = 5;

        System.out.println("Area => "+C2.area());
        System.out.println("Volume => "+C2.volume());

    }

}
