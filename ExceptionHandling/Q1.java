package ExceptionHandling;

public class Q1 {
    public static void main(String[] args) {
        int a, b, c;

        try {
            a = 50;
            b = 0;
            c = a/b;
            System.out.println("Result is: "+c);
            // System.out.println("Bye");
        }
        catch(ArithmeticException e) {
            System.out.println("Divison by 0");
            System.out.println(e);
        }
        System.out.println("Bye");
        
    }

}
