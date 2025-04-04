package Methods.A_Methods;

import java.util.Scanner;

public class Ex_8 {
    static int findMax(int arr[]) {
        int maxNo = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNo) {
                maxNo = arr[i];
            }
        }
        return maxNo;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 8, 3, 15, 9, 7 };

        // findMax(arr);
        System.out.println(findMax(arr));
    }

}
