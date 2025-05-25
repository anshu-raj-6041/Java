package OOPS.Constructor;
// Array of Objects

// import javax.security.auth.Subject;

class Subject {
    // Properties
    private int subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    // Property Methods
    // getter
    public int getSubId() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    // setter
    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtain(int mo) {
        marksObtain = mo;
    }

    // Constructor (jo compulsory ho)
    public Subject(int subID, String name) {
        this.subID = subID;
        this.name = name;

    }

    public Subject(int subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;

    }

    // Methods
    public boolean isQualified() {
        if (marksObtain >= (maxMarks / (10 * 4))) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Subject ID: " + subID + "\nName: " + name + "\nMarks Obtain: " + marksObtain;
    }
}

public class Q5_Subject {
    public static void main(String[] args) {
        // Array of Object
        Subject subs[] = new Subject[3];
        subs[0] = new Subject(101, "DS", 100);
        subs[1] = new Subject(102, "Algorithm", 200);
        subs[2] = new Subject(103, "COA", 70);

        // display
        for (Subject x : subs) {
            System.out.println(x);
        }

    }

}
