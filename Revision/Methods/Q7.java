package Revision.Methods;

import java.util.Scanner;

public class Q7 {
    // kyuki obj bna hai
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
        int a, b;

        System.out.println("Enter the First no: ");
        a = sc.nextInt();
        System.out.println("Enter the Second no: ");
        b = sc.nextInt();

        Q7 x = new Q7();
        System.out.println(x.gcd(a, b));
    }

}
