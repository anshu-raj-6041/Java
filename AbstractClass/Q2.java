package AbstractClass;

// We cannot create Object of abstract class

abstract class Hospital {
    abstract void emergency();

    abstract void appointment();

    abstract void admit();

    abstract void billing();
}

class MyHospital extends Hospital {
    public MyHospital() {

    }

    // Sb ko override krna jruri hai
    @Override
    void emergency() {
        System.out.println("Emergency");
    }

    void appointment() {
        System.out.println("Appointment");
    }

    void admit() {
        System.out.println("Admit");
    }

    void billing() {
        System.out.println("Billing");
    }

}

public class Q2 {
    public static void main(String[] args) {
        Hospital H1 = new MyHospital();
        // sirf Super ka call hota hai 
        H1.emergency();

    }

}
