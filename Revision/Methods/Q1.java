package Revision.Methods;
// max of 2 no

import java.util.Scanner;

public class Q1 {
    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the First no: ");
        a = sc.nextInt();
        System.out.println("Enter the Second no: ");
        b = sc.nextInt();

        c = max(a, b);
        System.out.println("Max no: " + c);

    }

}
