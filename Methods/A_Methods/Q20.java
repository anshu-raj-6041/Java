package Methods.A_Methods;
// Recursion

public class Q20 {
    // static void fun(int n) {
    //     if (n > 0) {
    //         System.out.println(n);
    //         fun(n - 1);  // 3, 2, 1
    //     }
    // }

    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);  // 1, 2, 3
        }
    }

    public static void main(String[] args) {
        fun(3);
    }

}
