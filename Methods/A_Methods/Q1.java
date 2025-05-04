package Methods.A_Methods;
// function in java known as methods

// Methods are member of class which provide functionality to the class
// return type => int me return krna hota hai
// void me return krna nhi hota hai


import java.util.*;

public class Q1 {

    static void inc(int x) {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the First no:");
        a = sc.nextInt();

        inc(a);
        System.out.println(a);
    }

}
