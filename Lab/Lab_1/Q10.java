package Lab.Lab_1;
// Leap year or not

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year");
        int y = sc.nextInt();

        if (y % 4 == 0 && y % 400 != 0 || y % 400 == 0) {
            System.out.println(y + " is a Leap Year");
        } else {
            System.out.println(y + " Not a Leap Year");
        }
    }

}
