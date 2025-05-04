package Methods.A_Methods;

public class Q14 {
    // static void showList(String... S) {
    // for (int i = 0; i < S.length; i++) {
    // System.out.println(i + 1 + "> " + S[i]);
    // }
    // }

    // Variable Argument parameter should be last one
    static void showList(int start, String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start + "> " + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(10, "Modi", "Rahul", "Kejriwal");

    }

}
