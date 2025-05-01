package ExceptionHandling;

class NDE extends Exception {
    public String toString() {
        return "Neagtive value";
    }
}

public class Q7_throw {
    static int area(int l, int b) throws NDE { 
        if(l<0 || b<0) {
            throw new NDE();
        }
        return (l*b);
    }
    static void meth1() throws NDE {
        System.out.println("Area is: "+area(-10, 20));
    }
    public static void main(String[] args) throws NDE {
        // meth1();
        try {
            meth1();
        }
        catch(NDE e) {
            System.out.println("Error");
        }

    }

}

