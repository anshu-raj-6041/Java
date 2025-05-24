package OOPS;

class Cylinder {
    // Properties
    public double r;
    public double h;

    // Methods
    public double lidArea() {
        return (Math.PI*r*r);
    }

    public double totalSurfaceArea() {
        return (2*lidArea()+circumference()*h);
    }

    public double volume() {
        return (lidArea()*h);

    }

    public double circumference() {
        return (2*Math.PI*r);
    }
}

// application class
public class Q4_Cylinder {
    public static void main(String[] args) {
        // Object creation
        Cylinder c1 = new Cylinder();

        c1.r = 10;
        c1.h = 20;

        System.out.println("lidArea => " + c1.lidArea());
        System.out.println("totalSurfaceArea => " + c1.totalSurfaceArea());
        System.out.println("Volume => " + c1.volume());
        System.out.println("Circumference => " + c1.circumference());

    }

}
