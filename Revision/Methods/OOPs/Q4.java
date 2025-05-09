package Revision.Methods.OOPs;

class Cylinder {
    public double r;
    public double h;

    public double lidArea() {
        return (Math.PI * r * r);
    }

    public double perimeter() {
        return (2 * Math.PI * r);
    }

    public double totalSurfaceArea() {
        return (2 * lidArea() + perimeter() * h);
    }

    public double volume() {
        return (lidArea() * h);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.r = 2;
        c1.h = 5;

        System.out.println("Area of lidArea: " + c1.lidArea());
        System.out.println("totalSurfaceArea: " + c1.totalSurfaceArea());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Volume: " + c1.volume());

    }

}
