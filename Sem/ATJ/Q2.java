package Sem.ATJ;

import java.util.Scanner;

// 2> WAP to calculate percentage of student for 3 different subjects. Create user defined exception for marks>100.

class MyE extends Exception {
    public String toString() {
        return "Marks > 100";
    }
}

public class Q2 {
    static double percentageCal(int m, int e, int h) throws MyE {
        if (m > 100 || e > 100 || h > 100) {
            throw new MyE();
        }
        return (m + e + h) / 3.0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Maths marks: ");
            int m = sc.nextInt();

            System.out.println("Enter English marks: ");
            int e = sc.nextInt();

            System.out.println("Enter Hindi marks: ");
            int h = sc.nextInt();

            double p = percentageCal(m, e, h);
            System.out.println("Percentage: " + p + "%");
        } catch (MyE e) {
            System.out.println("Exception: " + e);
        } catch (Exception e) {
            System.out.println("Invalid input: " + e);
        }

    }

}
