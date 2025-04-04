// Factorial
package Methods;

import java.util.Scanner;

public class Notes_3 {
    static int fac(int n) {
        int f = 1;
        for (int i = n; i > 0; i--) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ans;

        System.out.println("Enter the no:");
        n = sc.nextInt();

        ans = fac(n);
        System.out.println("Factorial => " + ans);
    }

}
