package Inheritance;

// Parent class / Super class
class CellPhone {
    // Properties
    public int phNo;
    public int imie;

    // Methods
    public void call() {
        System.out.println("Calling");
    }

    public void sms() {
        System.out.println("Message");
    }

}

// Child class / Sub class
class IPhone extends CellPhone {
    public int macNo;

    public void click() {
        System.out.println("Photo click");
    }

    public void music() {
        System.out.println("Music");
    }

}

public class Q4_Phone {
    public static void main(String[] args) {
        IPhone i1 = new IPhone();

        i1.music();
        i1.call();

    }

}
