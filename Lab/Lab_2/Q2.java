package Lab.Lab_2;

import java.util.Scanner;

// calculate factorial of a no using method

public class Q2 {
    static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        System.out.println("Factorial => " + fac(n));

    }

}
