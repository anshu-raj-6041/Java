package OOPS.Data_Hiding;
// Types of Properties
// 1> Read and Write :: getter and setter
// 2> Read only :: getter
// 3> Write only :: setter

class Rectangle {
    // Properties
    private double l;
    private double b;

    // getter methods (property methods)
    public double getLength() {
        return l;
    }

    public double getBreadth() {
        return b;
    }

    // setter methods
    public void setLength(double length) {
        // l = length;
        if(length > 0) {
            l = length;
        }
        else {
            l = 0;
        }
    }

    public void setBreadth(double breadth) {
        b = breadth;
    }

    // instance methods
    public double area() {
        // return (l * b);
        return getLength()*getBreadth();
    }

    public double perimeter() {
        return 2 * (l + b);
    }

    // enquiry methods
    public boolean isSquare() {
        if (l == b) {
            return true;
        } else {
            return false;
        }
    }
}

public class Rec_1 {
    public static void main(String[] args) {
        // object creation
        Rectangle R1 = new Rectangle();
        R1.setLength(10.5);
        R1.setBreadth(10.5);

        System.out.println("Area => " + R1.area());
        System.out.println("Perimeter => " + R1.perimeter());
        System.out.println("isSquare => " + R1.isSquare());

        System.out.println("Length => " + R1.getLength());
        System.out.println("Breadth => " + R1.getBreadth());

    }

}
