package Methods.A_Methods;
// object mtlb array, String

// Passing Object pass as Parameter

// content from actual param(main) copies to formal param

public class Ex_2 {
    static void update(int arr[]) {
        arr[0] = 420;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        update(arr);

        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
