package Sem.ATJ;
// 1> WAP that will show multiple exceptions at same time. Use nested try block.

import java.rmi.AccessException;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = { 10, 0, 40, 80, 70 };

        try {
            try {
                int r = arr[0] / arr[1];
                System.out.println(r);
            } catch (ArithmeticException e) {
                System.out.println("Divison by 0 " + e);
            }
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid " + e);
        }

    }

}
