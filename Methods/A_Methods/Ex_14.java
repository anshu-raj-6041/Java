package Methods.A_Methods;

public class Ex_14 {
    // static void showList(String... S) {
    // for (int i = 0; i < S.length; i++) {
    // System.out.println(i + 1 + "> " + S[i]);
    // }
    // }

    static void showList(int start, String... S) {
        for (int i = 0; i < S.length; i++) {
            System.out.println(start + "> " + S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(10,"Modi", "Rahul", "Kejriwal");

    }

}
