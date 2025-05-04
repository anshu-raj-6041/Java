package Methods.A_Methods;
// Variable Argument (int... A)

public class Q13_VA {
    static void show(int... A) {    // ... define Variable Argument
        // for each loop
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show();
        show(10, 20, 30);
        
        show(new int[] { 10, 20, 30, 40 }); // work for both (int []A)

    }

}
