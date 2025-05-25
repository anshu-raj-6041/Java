package ExceptionHandling;

// creating own Exception Class
class NDException extends Exception {
    public String toString() {
        return "Negative value";
    }
}

public class Q7_throw {
    static int area(int l, int b) throws NDException {
        if (l < 0 || b < 0) {
            throw new NDException();
        }
        return (l * b);
    }

    static void meth1() throws NDException {
        System.out.println("Area is: " + area(-10, 20));
    }

    public static void main(String[] args) throws NDException {
        // meth1();
        try {
            meth1();
        } catch (NDException e) {
            System.out.println("Error");
        }

    }

}
