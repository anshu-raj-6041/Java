package Revision.Methods;

import java.util.Scanner;

public class Q4 {
    static int add(int x, int y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the First no: ");
        a = sc.nextInt();
        System.out.println("Enter the Second no: ");
        b = sc.nextInt();

        System.out.println("Result => " + add(a, b));
    }

}
