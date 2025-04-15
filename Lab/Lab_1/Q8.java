package Lab.Lab_1;
// WAP to swap 2 no

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp;

        System.out.println("Enter First no: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second no: ");
        num2 = sc.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping");
        System.out.println("First no: " + num1);
        System.out.println("Second no: " + num2);

    }

}
