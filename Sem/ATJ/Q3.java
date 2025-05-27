package Sem.ATJ;
//3> Define user defined JAVA program that throw an exception when entered negative number.

import java.util.Scanner;

class MyEx extends Exception {
    public String toString() {
        return "Negative no not allowed !!";
    }
}

public class Q3 {
    static void checkN(int n) throws MyEx {
        if (n < 0) {
            throw new MyEx();
        } else {
            System.out.println("U entered + no: " + n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the no: ");
            int n = sc.nextInt();

            checkN(n);
        } catch (MyEx e) {
            System.out.println("Exception: " + e);
        } catch (Exception e) {
            System.out.println("Invalid input " + e);
        }

    }

}
