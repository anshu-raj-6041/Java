package Methods.A_Methods;

import java.util.Scanner;
// Prime or not (using method)

public class Ex_6 {
    static boolean isPrime(int p) {
        // int c = 0;
        for (int i = 2; i < (p / 2); i++) {
            if (p % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;

        System.out.println("Enter the no:");
        p = sc.nextInt();

        // ans = isPrime(p);
        System.out.println("Result => " + isPrime(p));

    }

}
