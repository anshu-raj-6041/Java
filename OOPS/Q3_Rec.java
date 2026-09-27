package OOPS;
// void me return nhi hota hai
// jb properties private hoga tb getter setter use krna hai

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
        return l == b;  // if both are equal return true else false
    }
}

public class Q3_Rec {
    public static void main(String[] args) {
        // Object creation
        // r1 is ref of type Rectangle with object new Rectangle()
        // r1 is a ref variable of type Rectangle, which refers to the object created by new Rectangle().
        Rectangle r1 = new Rectangle();

        r1.l = 5;
        r1.b = 2;

        System.out.println("Area of Rec => " + r1.area());
        System.out.println("Perimeter of Rec => " + r1.perimeter());
        System.out.println("Is Square => " + r1.isSquare());

    }

}
