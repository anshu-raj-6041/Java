package OOPS.Class;

// WAP to create Person class and an object Raju to Person class. Let us display
// the hash code no of object using hashCode()  => (pg=21)

class Person {
    // Properties
    public String name;
    public int age;

    // Methods
    public void talk() {
        System.out.println("Hello My name is: " + name);
        System.out.println("Hello My age is: " + age);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        // Object creation
        Person Raju = new Person(); // Raju :: reference variable
        System.out.println("Hash Code => " + Raju.hashCode());

    }

}
