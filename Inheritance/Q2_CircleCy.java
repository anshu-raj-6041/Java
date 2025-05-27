package Inheritance;

// Circle(super class) <---- Cylinder(sub class)

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
        return (Math.PI * radius * radius);
    }

    public double perimeter() {
        return (2 * Math.PI * radius);
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
        return (area() * height);
    }
}

public class Q2_CircleCy {
    public static void main(String[] args) {
        // Object creation
        // Circle c1 = new Circle();
        Cylinder c2 = new Cylinder();

        c2.radius = 7;
        c2.height = 10;

        // System.out.println("Area => " + c1.area());
        System.out.println("Area => " + c2.area());
        System.out.println("Volume => " + c2.volume());

    }

}
