package Lab.Lab_8;

public class Q2_NT {
    public static void main(String[] args) {
        int arr[] = {10, 0, 20, 30, 40};

        try {
            try {
                System.out.println(arr[0]/arr[1]);
            }
            catch(ArithmeticException e) {
                System.out.println("Divide by 0 " + e);
            }
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid " + e);
        }
        
    }
    
}
