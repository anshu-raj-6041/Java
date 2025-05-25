package Lab.Lab_8;

// WAP to show use of try catch and finally block

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {10, 0, 30, 40, 50};

        try {
            System.out.println(arr[0]/arr[1]);
        }
        // Execute when try get runtime error
        catch(ArithmeticException e) {
            System.out.println("Divide by 0 " + e);
        }
        finally {
            System.out.println("Finally called");
        }
        
    }
    
}
