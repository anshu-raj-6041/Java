package Methods.A_Methods;
// void me return nhi hota hai

import java.util.Scanner;

public class Q1_max {
    // static isliye kyuki main() method static hai
    // static method can call only static method
    // public int max(int x, int y) {  // formal parameter
    //     if(x > y) {
    //         return x;
    //     }
    //     else {
    //         return y;
    //     }
    // }
    static int max(int x, int y) {  // formal parameter
        if(x > y) {
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the first no: ");
        a = sc.nextInt();
        System.out.println("Enter the second no: ");
        b = sc.nextInt();

        c = max(a, b);  // actual parameter
        System.out.println("Max no: "+c);

        // Ydi static declare nhi krna hai to object bnalo
        // Q1_max Q1 = new Q1_max();
        // System.out.println("Max no: "+Q1.max(a, b));
    }
    
}
