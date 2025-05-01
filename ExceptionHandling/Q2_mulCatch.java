package ExceptionHandling;
// multiple catch block

public class Q2_mulCatch {
    public static void main(String[] args) {
        try {
            int arr[] = {100, 20, 0, 40, 50};

            int r = arr[0]/arr[2];

            System.out.println(r);
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e) {
            System.out.println("Divison by 0");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bound");
        }
        
    }
    
}
