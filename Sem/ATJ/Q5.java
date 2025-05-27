package Sem.ATJ;
// 5> Explain different uses of super keyword. Show with example. WAP to show demo of constructor inheritance.

class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    public void show(int a) {
        System.out.println(super.a); // 10
    }
}

public class Q5 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show(50);

    }

}
