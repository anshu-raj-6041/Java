package Sem.Imp;
// Create a class called ‘ThreeDObject’ and derive the classes Box, Cube, and Cylinder from it. The class ‘ThreeDObject’ has methods wholeSurfaceArea( ) and volume( ). Override these two methods in each of the derived classes to calculate the volume and whole surface area of each type of three-dimensional object. The dimensions of the objects are to be taken from the user and passed through the respective constructors of each derived class. Write a main method to test these classes. With a suitable example state the differences between method overloading and method overriding.

import java.util.Scanner;

import javax.swing.Box;

abstract class ThreeDObject {
    abstract public double wholeSurfaceArea();

    abstract public double volume();

}

class Box extends ThreeDObject {
    // Properties
    public double l;
    public double b;
    public double h;

    // Constructor
    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (l * b + b * h + b * l);
    }

    @Override
    public double volume() {
        return (l * b * h);
    }

}

class Cube extends ThreeDObject {
    public double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return (6 * side * side);
    }

    @Override
    public double volume() {
        return (side * side * side);
    }

}

class Cylinder extends ThreeDObject {
    public double r;
    public double hc;

    public Cylinder(double r, double hc) {
        this.r = r;
        this.hc = hc;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + hc);
    }

    @Override
    public double volume() {
        return Math.PI * r * r * hc;
    }

}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box
        System.out.println("Enter dimension of Box(l, b, h)");
        double l = sc.nextInt();
        double b = sc.nextInt();
        double h = sc.nextInt();
        Box b1 = new Box(l, b, h);
        System.out.println("Box Suface Area => " + b1.wholeSurfaceArea());
        System.out.println("Box Volume => " + b1.volume());

        // Cube
        System.out.println("Enter dimension of Cube(side)");
        double side = sc.nextInt();
        Cube c1 = new Cube(side);
        System.out.println("Cube Suface Area => " + c1.wholeSurfaceArea());
        System.out.println("Cube Volume => " + c1.volume());

        // Cylinder
        System.out.println("Enter dimension of Cylinder(r, h)");
        double r = sc.nextInt();
        double hc = sc.nextInt();
        Cylinder c2 = new Cylinder(r, h);
        System.out.println("Cylinder Suface Area => " + c2.wholeSurfaceArea());
        System.out.println("Cylinder Volume => " + c2.volume());

    }

}
