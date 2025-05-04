package Methods.A_Methods;

import java.util.Scanner;
// Parameter Passing
// the content of actual parameter are passed to formal parameter
// call by value (primitive)

public class Q4 {
    static int add(int x, int y) { // formal parameter
        return (x + y);
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
