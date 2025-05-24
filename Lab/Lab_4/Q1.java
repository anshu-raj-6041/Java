package Lab.Lab_4;

import java.util.Scanner;

// WAP to swap two variables

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("a => " + a);
        System.out.println("b => " + b);

    }

}
