package OOPS;

// How to write a Class
// Every Class should have Properties and Methods
// Properties => Variables

class Circle {
    // Properties
    public double radius;

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

public class Circle_1 {
    public static void main(String[] args) {
        // Object creation
        Circle c1 = new Circle();
        // Circle c2 = new Circle();

        c1.radius = 7;
        // c2.radius = 10;

        System.out.println("Area of Circle => " + c1.area());
        // System.out.println("Area of Circle_2 => " + c2.area());
        System.out.println("Perimeter of Circle => " + c1.perimeter());
        // System.out.println("Perimeter of Circle_2 => " + c2.perimeter());
        System.out.println("Circumference of Circle => " + c1.circumference());
        // System.out.println("Circumference of Circle_2 => " + c2.circumference());
    }

}
