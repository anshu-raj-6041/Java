package Lab.Lab_3;
// method overloading

// method name should be same
// no of parameters should be different
// data type of parameter should be different

public class Q1 {
    static int add(int a, int b) {
        return (a + b);
    }

    static int add(int a, int b, int c) {
        return (a + b + c);
    }

    static float add(float a, float b) {
        return (a + b);
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 integer: " + add(10, 20));
        System.out.println("Sum of 3 integer: " + add(10, 20, 90));
        System.out.println("Sum of 2 floating point no: " + add(10.5f, 20.2f));

    }

}
