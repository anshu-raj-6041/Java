package Lab.Lab_1;

import java.util.Scanner;
// Find max of 3 no

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter First no: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second no: ");
        num2 = sc.nextInt();
        System.out.println("Enter Third no: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greatest");
        } else {
            System.out.println(num3 + " is greatest");
        }
    }

}
