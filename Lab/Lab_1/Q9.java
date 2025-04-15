package Lab.Lab_1;
// Convert miles to km

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in miles");
        float miles = sc.nextFloat();

        float km = miles * (float) 1.6;

        System.out.println("Distance in km: " + km + " km");
    }

}
