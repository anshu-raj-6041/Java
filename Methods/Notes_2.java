// Find cube of a no
package Methods;

import java.util.Scanner;

public class Notes_2 {
    static int cube(int n) {
        int ans = (n * n * n);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a;

        System.out.println("Enter the no whose cube u wnt:");
        n = sc.nextInt();
        a = cube(n);
        System.out.println("Cube => " + a);

    }

}
