package Inheritance.MethodOverriding;

class Super {
    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2 from Super");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Meth2 from Sub");
    }
    public void meth3() {
        System.out.println("Meth3");
    }
}

public class Q4_DMD {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        // Super class ref holding the object of Sub class
        // whose method will called ? => methods of object class
        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();
        // can't call meth3()

    }

}
