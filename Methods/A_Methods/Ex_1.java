package Methods.A_Methods;
// return type => int me return krna hota hai

// void me return krna nhi hota hai

import java.util.Scanner;

public class Ex_1 {
    // static int max(int x, int y) {
    // if (x > y) {
    // return x;
    // } else {
    // return y;
    // }
    // }

    static void inc(int a) {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the First no:");
        a = sc.nextInt();
        System.out.println("Enter the Second no:");
        b = sc.nextInt();

        // c = max(a, b);
        // System.out.println("Max no: " + c);
        // System.out.println("Max no: " + max(a,b));

        inc(a);
        System.out.println(a);
    }

}
