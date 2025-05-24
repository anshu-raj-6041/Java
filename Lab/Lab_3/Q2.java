package Lab.Lab_3;
// WAP to find area of square, rec and triangle using MO

public class Q2 {
    static int area(int s) {
        return (s * s);
    }

    static int area(int l, int b) {
        return (l * b);
    }

    static double area(double b, double h) {
        return (b * h) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Area of Square: " + area(5));
        System.out.println("Area of Rectangle: " + area(2, 10));
        System.out.println("Area of Triangle: " + area(5.2f, 9.5f));

    }

}
