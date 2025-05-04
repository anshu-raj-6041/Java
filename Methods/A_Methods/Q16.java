package Methods.A_Methods;
// 2> Sum of all elements using variable argument

public class Q16 {
    static int sum(int... A) {  // VA
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // sum(10, 20);
        System.out.println(sum());
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30, 50));

    }

}
