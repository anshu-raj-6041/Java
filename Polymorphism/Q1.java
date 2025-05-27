package Polymorphism;

// Polymorphism using MO (compile time polymorphism)

class Test {
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public int max(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        // t1.max(10, 20);
        System.out.println(t1.max(10, 20));
        t1.max(10, 20, 5);
        
    }
    
}
