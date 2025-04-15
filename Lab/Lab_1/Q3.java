package Lab.Lab_1;
// WAP to add, subtract, multiply and divide using switch case

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, res;

        System.out.println("Enter the First no: ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second no: ");
        num2 = sc.nextInt();

        System.out.println("Choose the operator: +, -, *, /");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                res = (num1 + num2);
                System.out.println("Result => " + res);
                break;
            case '-':
                res = (num1 - num2);
                System.out.println("Result =>" + res);
                break;
            case '*':
                res = (num1 * num2);
                System.out.println("Result =>" + res);
                break;
            case '/':
                res = (num1 / num2);
                System.out.println("Result =>" + res);
                break;
            default:
                System.out.println("Invalid Operator");

        }
        sc.close();

    }

}
