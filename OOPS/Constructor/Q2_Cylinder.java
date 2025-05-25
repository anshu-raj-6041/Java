package OOPS.Constructor;

class Cylinder {
    // Properties
    private double radius;
    private double height;

    // Constructor ( Non-Parameterised )
    public Cylinder() {
        radius = 10;
        height = 5;
    }

    // Parameterised Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // getter
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // setter
    public void setRadius(double r) {
        radius = r;

    }

    public void setHeight(double h) {
        height = h;

    }

    public void setDimension(double r, double h) {
        radius = r;
        height = h;

    }

    // Methods
    public double lidArea() {
        return (Math.PI * radius * radius);
    }

    public double volume() {
        return lidArea() * height;
    }
}

public class Q2_Cylinder {
    public static void main(String[] args) {
        // object creation
        Cylinder C1 = new Cylinder();
        // C1.setRadius(50);
        // C1.setHeight(10);

        System.out.println("lidArea => " + C1.lidArea());
        System.out.println("Volume => " + C1.volume());

    }

}
