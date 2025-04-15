package Methods.A_Methods;

public class Ex_20 {
    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun(10);
    }

}
