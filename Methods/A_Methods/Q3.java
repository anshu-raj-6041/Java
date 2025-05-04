package Methods.A_Methods;

public class Q3 {
    static void update(int arr[], int index, int value) {
        arr[index] = value;

    }
    static void update2(int x, int value) {
        x = value;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };
        update(arr, 2, 420);

        System.out.println("Print whole Array");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // or
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int x = 10;
        update2(x, 20);
        System.out.println(x);
    }

}
