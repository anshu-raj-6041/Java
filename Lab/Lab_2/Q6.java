package Lab.Lab_2;

import java.util.Scanner;

// WAP to find ncr using method
// long is similar to int but long support large no(population)

public class Q6 {

    // Method to cal factorial
    static long fac(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Method to cal nCr
    static long nCr(int n, int r) {
        if (r > n) {
            return 0;
        } else {
            return fac(n) / (fac(r) * fac(n - r));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;

        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        r = sc.nextInt();

        long res = nCr(n, r);
        System.out.println("Result => " + res);

    }

}
