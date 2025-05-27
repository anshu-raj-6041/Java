package Sem.ATJ;

// 7> WAP to find area of rectangle, square and triangle using parametrized constructor. Use proper OOP approach. WAP to create example of copy constructor.

abstract class Shape {
    abstract double getArea();
}

// Rec
class Rectangle extends Shape {
    public double l;
    public double b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public double getArea() {
        return (l * b);
    }
}

// Square
class Square extends Shape {
    public double s;

    public Square(double s) {
        this.s = s;
    }

    @Override
    public double getArea() {
        return (s * s);
    }
}

// Tri
class Triangle extends Shape {
    public double h;
    public double base;

    public Triangle(double h, double base) {
        this.h = h;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (base * h) / 2;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Square s1 = new Square(5);
        Triangle t1 = new Triangle(10, 20);

        System.out.println("Area of rec: " + r1.getArea());
        System.out.println("Area of square: " + s1.getArea());
        System.out.println("Area of tri: " + t1.getArea());

    }

}
