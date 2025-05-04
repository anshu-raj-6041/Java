package Methods.A_Methods;
// Q1> Overloading method to cal areas

public class Q10 {
    static double area(double l, double b) {
        return (l * b);
    }

    static double area(double r) {
        return (Math.PI * r * r);
    }

    static double area(double l, double b, double h) {
        return ((l + b) * h) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangle => " + area(10.2, 20.5));
        System.out.println("Area of Circle => " + area(10.2));
        System.out.println("Area of Trapezium => " + area(10, 20, 25));

    }

}
