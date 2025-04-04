package Methods.A_Methods;

import java.util.Scanner;
// Parameter Passing
// call by value

public class Ex_4 {
    static int add(int a, int b) { // formal parameter
        return (a + b);
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First no:");
        a = sc.nextInt();
        System.out.println("Enter the Second no:");
        b = sc.nextInt();

        // method calling
        c = add(a, b); // actual parameter
        System.out.println("Result => " + c);
    }

}
