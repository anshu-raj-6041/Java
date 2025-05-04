package Methods.A_Methods;
// Adding no using Command Line

public class Q19 {
    public static void main(String[] args) {
        double sum = 0;
        for (String x : args) {
            // sum = sum + Double.parseDouble(x);

            if (x.matches("[0-9\\.]+")) {   // will ignore
                sum = sum + Double.parseDouble(x);
            }
        }
        System.out.println("Sum is " + sum);
    }

}
