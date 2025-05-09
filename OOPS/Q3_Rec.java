package OOPS;
// void me return nhi hota hai

class Rectangle {
    // Properties
    public int l;
    public int b;

    // Methods
    public int area() {
        return (l * b);
    }

    public int perimeter() {
        return 2 * (l + b);
    }

    public boolean isSquare() {
        // if (l == b) {
        // return true;
        // } else {
        // return false;
        // }
        return l == b;
    }
}

public class Q3_Rec {
    public static void main(String[] args) {
        // Object creation
        // R1 is ref of type Rectangle with object new Rectangle()
        Rectangle R1 = new Rectangle();

        R1.l = 5;
        R1.b = 55;

        System.out.println("Area of Rec => " + R1.area());
        System.out.println("Perimeter of Rec => " + R1.perimeter());
        System.out.println("Is Square => " + R1.isSquare());

    }

}
