package AbstractClass;

// We cannot create Object of abstract class

abstract class Hospital {
    abstract public void emergency();

    abstract public void appointment();

    abstract public void admit();

    abstract public void billing();
}

class MyHospital extends Hospital {
    // Constructor
    public MyHospital() {

    }

    // Sb ko override krna jruri hai
    @Override
    public void emergency() {
        System.out.println("Emergency");
    }

    public void appointment() {
        System.out.println("Appointment");
    }

    public void admit() {
        System.out.println("Admit");
    }

    public void billing() {
        System.out.println("Billing");
    }

}

public class Q2 {
    public static void main(String[] args) {
        Hospital h1 = new MyHospital();
        // sirf Super ka call hota hai 
        h1.emergency();

    }

}
