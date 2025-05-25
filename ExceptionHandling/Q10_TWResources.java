package ExceptionHandling;
// #

import java.util.*;
import java.io.*;

// Try with Resources
// anything outside the program, everything is resource

public class Q10_TWResources {
    static FileInputStream f1;
    static Scanner sc;

    static void Divide() throws Exception {
        f1 = new FileInputStream("");

        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/b);

        f1.close();
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        Divide();
        int x = sc.nextInt();
        System.out.println(x);

    }

}
