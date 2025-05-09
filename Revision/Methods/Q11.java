package Revision.Methods;

import java.util.Scanner;

public class Q11 {
    static int rev(int n) {
        int res = 0;
        while (n != 0) {
            int digit = n % 10;
            res = res * 10 + digit;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        System.out.println("Reverse no: " + rev(n));
    }

}
