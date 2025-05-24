package Lab.Lab_3;

import java.util.Scanner;

class Person {
    // Properties
    public String name;
    public int age;

    // Method to read age and name
    public void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public String showDetails() {
        return "Name: " + name + "\n" + "Age: " + age + "\n";
    }
}

class AgeCompare {
    public void compareAge(Person p1, Person p2) {
        if (p1.age > p2.age) {
            System.out.println(p1.name + " is older");
        } else if (p2.age > p1.age) {
            System.out.println(p2.name + " is older");
        } else {
            System.out.println("Both have same age");
        }

    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person();
        AgeCompare a1 = new AgeCompare();

        System.out.println("Enter details of 1 person: ");
        p1.inputDetails(sc);
        System.out.println("Enter details of 2 person: ");
        p2.inputDetails(sc);

        System.out.println("Age comparison");
        a1.compareAge(p1, p2);

    }

}
