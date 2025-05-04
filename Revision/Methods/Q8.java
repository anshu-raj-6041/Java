package Revision.Methods;

public class Q8 {
    static int findMax(int arr[]) {
        int maxNo = arr[0];

        for(int i=1; i<(arr.length); i++) {
            if(arr[i] > maxNo) {
                maxNo = arr[i];
            }
        }
        return maxNo;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int res = findMax(arr);
        System.out.println("Max no: "+res);
        
    }
    
}
