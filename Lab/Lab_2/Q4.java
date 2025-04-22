package Lab.Lab_2;

import java.util.Scanner;

// WAP to add 2 matrix

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;

        System.out.println("Enter rows and cols of First matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        int arr[][] = new int[r1][c1];
        System.out.println("Enter elements of First matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("Enter rows and cols of Second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if(r1!=r2 || c1!=c2) {
            System.out.println("rows ans cols of both matrix should be equal");
            return;
            
        }

        int brr[][] = new int[r2][c2];
        System.out.println("Enter elements of Second matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        int crr[][] = new int[r1][c1];
        System.out.println("Matrix Addition");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                crr[i][j] = arr[i][j] + brr[i][j];
                System.out.println(crr[i][j]+" ");
            }
        }

    }

}
