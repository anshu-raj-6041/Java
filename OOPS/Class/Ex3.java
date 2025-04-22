package OOPS.Class;

class Person {
    // Instance variable
    // Properties
    public String name = "Elon";
    public int age = 40;

    // Methods
    public void talk() {
        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        // Object creation
        Person Raju = new Person();

        Raju.name = "Anshu";
        Raju.age = 20;
        Raju.talk();
        
    }
    
}

