package OOPS.Class;

class Demo {
    // Properties
    private int n;

    // Property Methods
    public int getN() {
        return n;
    }

    // Methods
    public void fun() {
        n = 100;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Demo D1 = new Demo();
        D1.fun();
        System.out.println("Number is: " + D1.getN());

    }

}
