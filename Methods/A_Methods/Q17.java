package Methods.A_Methods;
// 3> Calculate discount using variable argument

public class Q17 {
    static double discount(double... prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }

        if (sum > 500) {
            return sum * 0.10;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        // discount(100, 20, 50, 8000);
        System.out.println("Discount => "+discount(1000.5, 5000, 40));

    }

}
