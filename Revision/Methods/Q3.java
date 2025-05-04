package Revision.Methods;

public class Q3 {
    static void update(int arr[]) {
        arr[0] = 420;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };
        update(arr);

        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
