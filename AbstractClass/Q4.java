package AbstractClass;

abstract class Shape {
    abstract public void perimeter();

    abstract public void area();
}

class Circle extends Shape {
    public int radius;

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }

    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rec extends Shape {
    public int l;
    public int b;

    public void perimeter() {
        System.out.println("Perimeter of Rec: " + (2 * (l + b)));
    }

    public void area() {
        System.out.println("Area of Circle: " + (l * b));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Rec R1 = new Rec();
        R1.l = 10;
        R1.b = 5;
        R1.area();
        
        // Shape S1 = new Rec();

    }

}
