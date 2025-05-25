package ExceptionHandling;

public class Q1 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 0;

        try {
            c = a/b;
            System.out.println("Result is: " + c);
            // System.out.println("Bye");
        }
        catch(ArithmeticException e) {
            System.out.println("Divison by 0 not possible");
            System.out.println(e);
        }
        System.out.println("Bye");
        
    }

}
