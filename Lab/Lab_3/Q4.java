package Lab.Lab_3;

import java.util.Scanner;

class Emmployee {
    // Properties
    public String name;
    public double salary;

    // Method to read employees details
    public void inputDetails(Scanner sc) {
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
        sc.nextLine();

    }

    public String details() {
        return "Name: " + name + "\n" + "Salary: " + salary + "\n";
    }
}

class salaryCompare {
    // Method to compare salary
    public void compareSalaries(Emmployee e1, Emmployee e2) {
        if (e1.salary > e2.salary) {
            System.out.println(e1.name + " have higher salary");
        } else if (e2.salary > e1.salary) {
            System.out.println(e2.name + " have higher salary");
        } else {
            System.out.println("Both have same salary");
        }
    }
}

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emmployee e1 = new Emmployee();
        Emmployee e2 = new Emmployee();
        salaryCompare s1 = new salaryCompare();

        System.out.println("Enter details of first employee: ");
        e1.inputDetails(sc);
        System.out.println("Enter details of second employee: ");
        e2.inputDetails(sc);

        System.out.println("Comparing salary: ");
        s1.compareSalaries(e1, e2);

    }

}
