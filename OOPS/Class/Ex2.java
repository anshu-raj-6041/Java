package OOPS.Class;

class Person {
    // Properties
    public String name;
    public int age;

    // Methods
    public void talk() {
        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        // Object creation
        Person Raju = new Person();

        Raju.talk();
        
    }
    
}
