package Inheritance.Constructor;
// Constructor in Inheritance

// Constructors are methods in class which are called automatically when Ob is created

class Parent {
    // Constructor
    public Parent() {
        System.out.println("Parent Constructor");

    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class Q1_Parent {
    public static void main(String[] args) {
        // Object creation
        // Parent p1 = new Parent(); // Parent C
        // Child c1 = new Child(); // Parent C, Child C
        GrandChild G1 = new GrandChild(); // Parent c, Child C, GrandChild c

    }

}
