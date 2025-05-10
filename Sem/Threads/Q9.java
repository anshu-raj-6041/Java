package Sem.Threads;

// Multiple threads are performing multiple task

class PrintNumber extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numbers => " + i);
        }
    }
}
class PrintMessage extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message: Hello from Thread => " + i);
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        PrintMessage p2 = new PrintMessage();

        p1.start();
        p2.start();

    }

}
