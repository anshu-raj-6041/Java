package Revision.Methods;

import java.util.Scanner;

public class Q6 {
    static boolean isPrime(int n) {
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no: ");
        n = sc.nextInt();

        boolean ans = isPrime(n);
        System.out.println(ans);
    }

}
