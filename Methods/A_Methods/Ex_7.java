package Methods.A_Methods;
// GCD of 2 no

// jo bda subtract small wla

import java.util.Scanner;

public class Ex_7 {
    int gcd(int m, int n) {
        while (m != n) {
            if (m > n) {
                m = (m - n);
            } else {
                n = (n - m);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.println("Enter the First no:");
        m = sc.nextInt();
        System.out.println("Enter the Second no:");
        n = sc.nextInt();

        // gcd(m, n);
        // If we are not using static in method class
        Ex_7 x = new Ex_7();
        System.out.println(x.gcd(m, n));
    }

}
