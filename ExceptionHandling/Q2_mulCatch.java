package ExceptionHandling;
// multiple catch block

public class Q2_mulCatch {
    public static void main(String[] args) {
        int arr[] = {100, 20, 0, 40, 50};

        try {
            // int arr[] = {100, 20, 0, 40, 50};

            int r = arr[0]/arr[2];

            System.out.println("Divison is " + r);
            System.out.println(arr[10]);
        }
        // should be sub class
        catch(ArithmeticException e) {
            System.out.println("Divison by 0 " + e);
        }
        // should be super class(Exception e)
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid " + e);
        }
        System.out.println("Bye");
        
    }
    
}
