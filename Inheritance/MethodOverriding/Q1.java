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
}

public class Q1 {
    public static void main(String[] args) {
        Super S1 = new Super(); // Hello from Super
        // S1.display();

        Sub S2 = new Sub(); // Hello from Sub
        // S2.display();

        // Dynamic Method Dispatch (method of Object will be called)
        // Super class reference holding Object of Sub class
        Super S3 = new Sub();   // Hello from Sub
        S3.display();
        
    }
    
}
