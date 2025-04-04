package Methods.A_Methods;
// content from actual param are copied to formal param (reference/address copied)

// call by reference

public class Ex_5 {
    static void welcome(String n) {
        System.out.println("Welcome Mr " + n);
    }

    public static void main(String[] args) {
        String name = "Modi";
        welcome(name);
    }

}
