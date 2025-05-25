package Lab.Lab_8;
// show diff types of Exception

import java.net.NetPermission;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = {10, 0, 20, 30, 40, 50};

        try {
            System.out.println(arr[0]/arr[1]);
        }
        catch(ArithmeticException e) {
            System.out.println("Caught Unchecked Exception " + e);
        }

        try {
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Unchecked Exception " + e);
        }

        try {
            String s = null;
            System.out.println("Length => " + s.length());
        }
        catch(NullPointerException e) {
            System.out.println("Caught Unchecked Exception " + e);
        }
        
    }
    
}
