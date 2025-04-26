package AbstractClass;

abstract class Super {
    // Constructor
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    // abstract method
    abstract public void meth2();
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub meth2");
    }
}

public class Q1 {
    public static void main(String[] args) {
        // call Super(first) ka hoga 
        Super S1 = new Sub();
        S1.meth1();
        S1.meth2();

    }

}
