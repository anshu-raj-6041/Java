package Methods.A_Methods;
// GCD of 2 no

// jo bda subtract small wla, jb tk equal na ho jaye

import java.util.Scanner;

public class Q7 {
    public int gcd(int m, int n) {
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

        System.out.println("Enter the First no: ");
        m = sc.nextInt();
        System.out.println("Enter the Second no: ");
        n = sc.nextInt();

        // gcd(m, n);
        // If we are not using static in method class
        Q7 x = new Q7();
        System.out.println("GCD => "+ x.gcd(m, n));
    }

}
