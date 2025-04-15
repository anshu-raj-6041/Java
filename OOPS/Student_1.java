package OOPS;

class Student {
    // Properties
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    // Methods
    public int total() {
        return (m1 + m2 + m3);
    }

    public float avg() {
        return (float) total() / 3;
    }

    public char grade() {
        if (avg() > 60) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public String details() {
        return "Roll: " + roll + "\n" + "Name: " + name + "\n";
    }
    public String toString() {
        return "Roll: " + roll + "\n" + "Name: " + name + "\n";
    }
}

public class Student_1 {
    public static void main(String[] args) {
        // Object
        Student S1 = new Student();

        S1.roll = 34;
        S1.name = "Anshu";
        S1.course = "CSE";
        S1.m1 = 92;
        S1.m2 = 100;
        S1.m3 = 80;

        System.out.println("Total => " + S1.total());
        System.out.println("Average => " + S1.avg());
        System.out.println("Details => " + S1.details());
        System.out.println("Details => " + S1);

    }

}
