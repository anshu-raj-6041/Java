package ExceptionHandling;
// nested try-catch

public class Q3_nestedTC {
    public static void main(String[] args) {
        int arr[] = { 10, 0, 30, 40 };

        try {
            // int arr[] = {10, 0, 30, 40};
            try {
                int r = arr[0] / arr[1];
                System.out.println(r);
            } catch (ArithmeticException e) {
                System.out.println("Divison by 0 " + e);
            }
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid " + e);
        }

    }

}
