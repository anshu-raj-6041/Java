package OOPS.Constructor;

class Student {
    // Properties
    private int rollNo;
    private String name;
    private String dept;
    private String sub;

    // Property Methods
    // getter
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getSub() {
        return sub;
    }

    // setter
    public void setDept(String dp) {
        dept = dp;
    }

    public void setSub(String subject) {
        sub = subject;
    }

    // Constructor // jb same naam use krte hai to (this.rollNo) use krte hai
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Methods
    public String toString() {
        return "\nRoll No: " + rollNo + "\nName: " + name;
    }
}

public class Q6_Student {
    public static void main(String[] args) {
        // Array of Objects
        Student s[] = new Student[3];
        s[0] = new Student(10, "Anshu");
        s[1] = new Student(11, "Modi");
        s[2] = new Student(12, "Trump");

        for (Student x : s) {
            System.out.println(x);
        }

    }

}
