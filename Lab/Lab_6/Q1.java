package Lab.Lab_6;

import java.util.Scanner;

// super class
class Teacher {
    // Properties
    String teacherName;
    String subject;

    // Method to read Teacher info
    public void readDataT(Scanner sc) {
        System.out.println("Enter Teacher name: ");
        teacherName = sc.nextLine();
        System.out.println("Enter Subject: ");
        subject = sc.nextLine();
    }

    // Method to display Teacher data
    public void displayT() {
        System.out.println("Teacher name: " + teacherName);
        System.out.println("Subject: " + subject);
    }

}

// sub class
class Student extends Teacher {
    String studentName;
    int rollNo;

    public void readDataS(Scanner sc) {
        System.out.println("Enter Student name: ");
        studentName = sc.nextLine();
        System.out.println("Enter rollNo: ");
        rollNo = sc.nextInt();
    }

    public void displayS() {
        System.out.println("Student name: " + studentName);
        System.out.println("Roll_No: " + rollNo);
    }

}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hmesha sub class
        Student s1 = new Student();

        // read data
        s1.readDataT(sc);
        s1.readDataS(sc);

        // display data
        System.out.println("**** Teacher Info ****");
        s1.displayT();

        System.out.println("**** Student Info ****");
        s1.displayS();

    }

}
