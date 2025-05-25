package Lab.Lab_8;
// show an example of multiple catch block

public class Q2 {
    public static void main(String[] args) {
        int arr[] = {10, 0, 20, 30, 40};

        try {
            System.out.println(arr[0]/arr[1]);
            System.out.println(arr[10]);
        }
        // Execute when try get any runtime error
        catch(ArithmeticException e) {
            System.out.println("Divide by 0 " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid " + e);
        }
        
    }
    
}
