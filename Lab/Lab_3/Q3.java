package Lab.Lab_3;
// Create a database for 3 student. Use proper OOP approach

class Student {
    // Properties
    // jb properties private ho tb getter setter use kr skte hai
    private String name;
    private int rollNO;
    private String course;

    // constructor
    public Student(String name, int rollNO, String course) {
        this.name = name;
        this.rollNO = rollNO;
        this.course = course;
    }

    // Methods
    public String details() {
        return "Name: " + name + "\n" + "Roll: " + rollNO + "\n" + "Course: " + course + "\n";
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student s1 = new Student("Anshu", 34, "CSE");
        Student s2 = new Student("Modi", 420, "Arts");
        Student s3 = new Student("Elon", 10, "Science");

        System.out.println(s1.details());
        System.out.println(s2.details());
        System.out.println(s3.details());

    }

}
