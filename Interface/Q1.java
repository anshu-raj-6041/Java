package Interface;

interface Test {
    void meth1();
    void meth2();

}

class My implements Test {
    public void meth1() {
        System.out.println("Meth1 of class My");
    }

    public void meth2() {
        System.out.println("Meth2 of class My");
    }

    public void meth3() {
        System.out.println("Meth3 of class My");
    }
}

public class Q1 {
    public static void main(String[] args) {
        // jiska ref lenge whi method call hoga
        Test T1 = new My();
        T1.meth1();
        T1.meth2();

    }

}
