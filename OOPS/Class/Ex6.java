package OOPS.Class;

class Demo {
    // Properties
    private String name = "Anshu";
    private int age = 20;

    // setter
    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    // Methods
    public void talk() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
}

public class Ex6 {
    public static void main(String[] args) {
        // Object creation
        Demo Raju = new Demo();
        Raju.talk();

        Demo Sita = new Demo();
        Sita.setData("Radha", 18);
        Sita.talk();

    }

}
