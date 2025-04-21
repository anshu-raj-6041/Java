package Lab.Lab_1;
// grading system

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.println("Enter ur marks: ");
        marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("D");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

    }

}
