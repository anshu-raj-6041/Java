package Revision.Methods;
// Method Overloading

public class Q9 {
    static int max(int x, int y) {
        return (x > y) ? x : y;
    }
    static float max(float x, float y) {
        return (x > y) ? x : y;
    }
    static int max(int x, int y, int z) {
        return (x > y) && (x > z) ? x : (y > z ? y : z);
    }
    public static void main(String[] args) {
        System.out.println(max(2, 5));
        System.out.println(max(2.5f, 5.2f));
        System.out.println(max(2, 5, 7));
    }

}
