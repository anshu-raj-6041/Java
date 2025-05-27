package Lab.Lab_5;

import java.util.Scanner;

class Complex {
    int real;
    int img;
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex sum = new Complex();

        // Enter the first complex no
        System.out.println("Enter the real part of 1st complex no: ");
        c1.real = sc.nextInt();
        System.out.println("Enter the img part of 1st complex no: ");
        c1.img = sc.nextInt();

        // Enter the second complex no
        System.out.println("Enter the real part of 2nd complex no: ");
        c2.real = sc.nextInt();
        System.out.println("Enter the img part of 2nd complex no: ");
        c2.img = sc.nextInt();

        // add
        sum.real = c1.real + c2.real;
        sum.img = c1.img + c2.img;

        // display
        System.out.println("Sum => " + sum.real + " + " + sum.img + "i");
    }

}
