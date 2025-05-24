package Lab.Lab_4;

class Student {
    // Properties
    private String name;
    private int marks;

    // constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display
    public String showDetails() {
        return "Name: " + name + "\n" + "Marks: " + marks + "\n";
    }

    // Method to compare marks
    public static void compareMarks(Student s1, Student s2) {
        if(s1.marks > s2.marks) {
            System.out.println(s1.name + " has higher marks");
        }
        else if(s2.marks > s1.marks) {
            System.out.println(s2.name + " has higher marks");
        }
        else {
            System.out.println("Both have equal marks");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student s1 = new Student("Anshu", 100);
        Student s2 = new Student("Virat", 20);

        System.out.println("Student 1: " + s1.showDetails());
        System.out.println("Student 2: " + s2.showDetails());

        System.out.println("Comparison: ");
        Student.compareMarks(s1, s2);
        

    }

}
