package Methods.A_Methods;
// Method Overloading

// method ka naam same rahega
// 1> data type of parameter should be different, if same no of parameter
// 2> no of parameter should be different

public class Q9MO {
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;
    }

    static int max(int x, int y, int z) {
        // return (x > y && x > z) ? x : (y > z ? y : z);
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max(10.5f, 20.2f));
        System.out.println(max(10, 20, 90));

    }

}
