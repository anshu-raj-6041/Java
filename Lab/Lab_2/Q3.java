package Lab.Lab_2;

import java.util.Scanner;

// WAP to find largest and smallest number in an Array

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int mini = arr[0];
        int maxi = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }

        System.out.println("Smallest => " + mini);
        System.out.println("Largest => " + maxi);

    }

}
