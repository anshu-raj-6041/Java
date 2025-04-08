package Methods.A_Methods;

import java.util.Scanner;
// overload method to reverse a int or array

public class Ex_11 {
    static int reverse(int n) {
        int num = 0;
        while (n != 0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n = n / 10;
        }
        return num;
    }

    // reverse an array
    static int[] reverse(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        System.out.println("Reverse no: " + reverse(n));

        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse Array:");
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
