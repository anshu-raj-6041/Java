package Inheritance.MethodOverriding;

// super class
class Car {
    public void start() {
        System.out.println("Car started");
    }

    public void accelerate() {
        System.out.println("Car is Accelerated");
    }

    public void changeGear() {
        System.out.println("Car gear changed");
    }
}

// sub class
class LCar extends Car {
    @Override
    public void changeGear() {
        System.out.println("Automatic Gear");
    }
    public void openRoof() {
        System.out.println("Sun roof is open");
    }

}

public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.changeGear();

        LCar c2 = new LCar();
        // C2.start();
        // C2.accelerate();
        c2.changeGear();
        c2.openRoof();

        // Dynamic Method Dispatch
        Car C3 = new LCar();
        // Method call hoga 1 wla
        C3.start();
        C3.changeGear();    // Overriding ke case me second wla

    }

}
