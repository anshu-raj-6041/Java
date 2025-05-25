package ExceptionHandling;
// finally

class MyE extends Exception {
    public String toString() {
        return "Marks > 100";
    }
}

public class Q8_finally {
    public static void main(String[] args) {
        int m = 109;
        try {
            if (m > 100) {
                throw new MyE();
            }
        } catch (MyE e) {
            System.out.println("Error");
        } finally {
            System.out.println("Bye");
        }

    }

}
