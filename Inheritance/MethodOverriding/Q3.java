package Inheritance.MethodOverriding;

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
        Car C1 = new Car();
        // C1.accelerate();
        // C1.changeGear();

        LCar C2 = new LCar();
        // C2.start();
        // C2.accelerate();
        // C2.changeGear();
        // C2.openRoof();

        Car C3 = new LCar();
        // Method call hoga 1 wla
        C3.start();
        C3.changeGear();    // Overriding ke case me second wla

    }

}
