package Revision.Methods;

public class Q12 {
    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age) {
        return (age >= 18);
    }

    public static void main(String[] args) {
        System.out.println(validate("Anshu"));
        System.out.println(validate(15));
    }

}
