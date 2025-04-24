package Inheritance.MethodOverriding;

class TV {
    // Methods
    public void switchOn() {
        System.out.println("TV is switch on");
    }

    public void changeChannel() {
        System.out.println("TV channel is changed");
    }
}

class SmartTv extends TV {
    // Methods
    @Override
    public void switchOn() {
        System.out.println("Smart TV is switch on");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel is changed");
    }
    public void browse() {
        System.out.println("Smart TV is browsing");
    }

}

public class Q2 {
    public static void main(String[] args) {
        // T1 is reference
        TV T1 = new TV();
        // T1.switchOn();
        // T1.changeChannel();

        SmartTv T2 = new SmartTv();
        // T2.switchOn();
        // T2.browse();

        // T3 => reference is of TV(Super) class and object is of Sub class
        TV T3 = new SmartTv();
        T3.switchOn();  // Smart TV is switch on
        T3.changeChannel(); // Smart TV change channel
        // we cannot browse()

    }

}
