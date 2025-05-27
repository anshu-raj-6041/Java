package Sem.ATJ;

// 6> What is dynamic method dispatch in JAVA. Explain with example.

class Super {
    public void meth1() {
        System.out.println("Meth1 from Super");
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
        System.out.println("Meth3 from Sub");
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        // Super class ref holding the object of Sub class
        // whose method will be called ? method of Obj class
        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();

        // s1.meth3(); can't call

    }

}
