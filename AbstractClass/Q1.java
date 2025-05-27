package AbstractClass;

// abstract class 
// if method is abstract, class should be made abstract
// vice-versa not compulsory
abstract class Super {
    // Constructor
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    // abstract method (no body)
    abstract public void meth2();
}

// to become concrete class => override all abstract methods of Super class
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
