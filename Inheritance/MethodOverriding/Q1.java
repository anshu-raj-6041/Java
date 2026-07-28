package Inheritance.MethodOverriding;

// Method Overriding => redefining method of Super class in Sub class

class Super {
    public void display() {
        System.out.println("Hello from Super");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Hello from Sub");
    }

    public void check() {
        System.out.println("Checking");
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Super s1 = new Super(); // Hello from Super
        // s1.display();

        // Sub s2 = new Sub(); // Hello from Sub
        // s2.display();

        // Dynamic Method Dispatch (method of Object will be called)
        // Super class reference holding Object of Sub class
        Super s3 = new Sub(); // Hello from Sub
        s3.display();

    }

}
