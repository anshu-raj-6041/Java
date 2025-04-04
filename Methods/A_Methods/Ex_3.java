package Methods.A_Methods;

public class Ex_3 {
    static void update(int arr[], int index, int value) {
        arr[index] = value;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };
        update(arr, 2, 420);

        System.out.println("Print whole Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
