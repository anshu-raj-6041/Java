package Inheritance.Constructor;

// Parameterised Constructor in Inheritance

class Parent {
    public Parent() {
        System.out.println("Non Para Cons of Parent");
    }
    public Parent(int x) {
        System.out.println("Para Cons of Parent " + x);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non Para Cons of Child");
    }
    public Child(int y) {
        System.out.println("Para Cons of Child");
    }
    public Child(int x, int y) {
        super(x);   // to call PC of super class
        System.out.println("2 Para Cons of Child"+y);
    }
}

public class Q2_ParaConst {
    public static void main(String[] args) {
        // Child c1 = new Child();  // Non PC of parent, Non PC of Child
        // Child c2 = new Child(20);   // Non PC of parent, PC of Child
        Child C1 = new Child(10, 20);   // PC of parent10, 2 PC of child20
        
    }
    
}
