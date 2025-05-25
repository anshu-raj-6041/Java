package Methods.A_Methods;
// Command Line Argument

// javac Methods/A_Methods/Q18.java
// java Methods.A_Methods.Q18 Hello World 123

public class Q18 {
    public static void main(String[] args) {
        // for (String s : args) {
        // System.out.println(s);
        // }

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

    }

}
