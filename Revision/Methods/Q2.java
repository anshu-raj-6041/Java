package Revision.Methods;

import java.util.Scanner;

public class Q2 {
    static void inc(int x) {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Enter the no: ");
        a = sc.nextInt();

        inc(a);
        System.out.println("After: " + a);
    }

}
