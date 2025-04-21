package Arrays;

public class demo_1 {
    public static void main(String[] args) {
        // declaration of array
        int arr[] = new int[10];
        int [] brr = new int[10];
        int crr[] = {10, 20, 30, 40};

        crr[2] = 100;
        // crr[1] = 50;

        // for(int i=0; i<arr.length; i++) {
        //     System.out.println(crr[i]);
        // }

        // using for each loop
        for(int x : crr) {
            System.out.println(x);
        }

    }
    
}
