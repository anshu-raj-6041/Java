package Revision.Methods.OOPs;

class Rectangle {
    public int l;
    public int b;

    public int area() {
        return (l * b);
    }

    public int perimeter() {
        return (2 * (l + b));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.l = 10;
        r1.b = 20;

        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Perimeter of Rectangle: " + r1.perimeter());
        
    }
    
}
