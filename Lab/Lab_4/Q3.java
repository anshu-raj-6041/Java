package Lab.Lab_4;

class Square {
    private double s;

    public Square(double s) {
        this.s = s;
    }

    public double area() {
        return (s * s);
    }

}

class Rectangle {
    private double l;
    private double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return (l * b);
    }

}

class Triangle {
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return (b * h) / 2;
    }

}

public class Q3 {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Rectangle r1 = new Rectangle(5, 10);
        Triangle t1 = new Triangle(10, 20);

        System.out.println("Area of Square: " + s1.area());
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Area of Triangle: " + t1.area());

    }

}
