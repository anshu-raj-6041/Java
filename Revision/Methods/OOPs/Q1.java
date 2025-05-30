package Revision.Methods.OOPs;

class Circle {
    public double radius;

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

public class Q1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;

        System.out.println("Area of Circle: " + c1.area());
        System.out.println("Perimeter of Circle: " + c1.perimeter());
        System.out.println("Circumference of Circle: " + c1.circumference());

    }

}
