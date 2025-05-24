package OOPS;

class Car {
    // Properties
    public String name;
    public String regNo;
    // public Color col;
    public double fuelQty; 

    // Methods
    public void start() {
        System.out.println("Car started");
        
    }
    public void stop() {
        System.out.println("Car stop");

    }
    public void changeGear() {
        System.out.println("Please change the gear");

    }
    public void accelerate() {
        System.out.println("Please accelerate the car");

    }
}

public class Q7_Car {
    public static void main(String[] args) {
        // Object creation
        Car c1 = new Car();

        c1.accelerate();
        
    }
    
}
