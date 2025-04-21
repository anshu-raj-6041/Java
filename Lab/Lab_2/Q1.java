package Lab.Lab_2;
// WAP to add 2 no using 

// 1> Command Line Argument
// 2> Scanner Class

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter the First no: ");
        num1 = sc.nextInt();
        System.out.println("Enter the Second no: ");
        num2 = sc.nextInt();

        System.out.println("Addition => "+(num1+num2));

    }

}
