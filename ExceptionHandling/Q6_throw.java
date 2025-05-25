package ExceptionHandling;
// if ans is correct then return

// if ans is not correct then throw

public class Q6_throw {
    static int area(int l, int b) throws Exception { // this method throws E
        // jha "throws Exception" likha hua hai uske next method me try-catch hoga
        if (l < 0 || b < 0) {
            throw new Exception("Dimensions cannot be -");
        }
        return (l * b);
    }

    static void meth1() throws Exception {
        System.out.println("Area is: " + area(-10, 20));
    }

    // if we don't want to use try-catch
    // public static void main(String[] args) throws Exception {
    // meth1();

    // }
    // or
    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
