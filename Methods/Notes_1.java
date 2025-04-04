package Methods;

public class Notes_1 {
    static void show() {
        System.out.println("Hello from Show");
    }

    static void display() {
        System.out.println("Hello from Display");
        show();
    }

    public static void main(String[] args) {
        show();
        display();
    }

}
