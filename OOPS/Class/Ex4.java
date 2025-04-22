package OOPS.Class;

class Person {
    // Instance variable are initialized here
    // Properties
    private String name = "Elon";
    private int age = 40;

    // Methods
    public void talk() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        // Object creation
        Person Raju = new Person();
        Raju.talk();

        Person Sita = new Person();
        Sita.talk();

    }

}
