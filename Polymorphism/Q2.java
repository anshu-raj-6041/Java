package Polymorphism;

// Polymorphism using Method Overriding (run-time polymorphism)

class Super {
    public void display() {
        System.out.println("Display from Super");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Display from Sub");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // DMD
        // method call depends on object during run-time
        Super s1 = new Sub();
        s1.display();

    }

}
