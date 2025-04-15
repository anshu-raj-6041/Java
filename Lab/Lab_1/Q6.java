package Lab.Lab_1;
// WAP to accept a string, char and float variable and print them

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Enter a float no: ");
        float f = sc.nextFloat();

        System.out.println("You entered");
        System.out.println("String: " + str);
        System.out.println("Character: " + ch);
        System.out.println("Float: " + f);

    }

}
