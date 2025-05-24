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

    public double avg() {
        // because total gives int, typecast total()
        // return (float) total() / 3;
        return total() / 3.0;
    }

    public char grade() {
        if (avg() >= 60) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public String details() {
        return "Roll: " + roll + "\n" + "Name: " + name + "\n";
    }
    // public String toString() {
    //     return "Roll: " + roll + "\n" + "Name: " + name + "\n";
    // }
}

public class Q5_Student {
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student();

        s1.roll = 34;
        s1.name = "Anshu";
        s1.course = "CSE";
        s1.m1 = 92;
        s1.m2 = 100;
        s1.m3 = 80;

        System.out.println("Total => " + s1.total());
        System.out.println("Average => " + s1.avg());
        System.out.println("Details ::\n" + s1.details());
        
        // jb toString() hoga tb directly s1 se access kr skte hai
        // System.out.println("Details => " + s1);

    }

}
