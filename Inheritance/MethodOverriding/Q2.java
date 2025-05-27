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
        // TV t1 = new TV();
        // t1.switchOn();
        // t1.changeChannel();

        SmartTv t2 = new SmartTv();
        t2.switchOn();
        t2.browse();

        // t3 => reference is of TV(Super) class and object(sub) is of Sub class
        TV t3 = new SmartTv();
        t3.switchOn(); // Smart TV is switch on
        t3.changeChannel(); // Smart TV change channel
        // we cannot browse()

    }

}
