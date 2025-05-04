package Methods.A_Methods;
// overload method to validate name and age

public class Q12 {
    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");

    }

    static boolean validate(int age) {
        return (age >= 3 && age <= 15);

    }

    public static void main(String[] args) {
        System.out.println(validate("Ansh@"));
        System.out.println(validate(20));

    }

}
