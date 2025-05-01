package ExceptionHandling;

public class Q6_throw {
    static int area(int l, int b) throws Exception { 
        if(l<0 || b<0) {
            throw new Exception();
        }
        return (l*b);
    }
    static void meth1() throws Exception {
        System.out.println("Area is: "+area(-10, 20));
    }
    public static void main(String[] args) throws Exception {
        meth1();

    }

}
