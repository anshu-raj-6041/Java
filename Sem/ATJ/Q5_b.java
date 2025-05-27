package Sem.ATJ;

// Constructor in Inheritance

class Parent {
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
        System.out.println("GrandChild Constructor");
    }
}

public class Q5_b {
    public static void main(String[] args) {
        // Object creation
        Parent p1 = new Parent();
        Child c1 = new Child();
        GrandChild g1 = new GrandChild();

    }

}
