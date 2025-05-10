package Sem.Threads;

class TaskOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count => " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("TaskOne Interrupted");
        }
    }
}

class TaskTwo implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count => " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("TaskTwo Interrupted");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Extending Thread
        TaskOne t1 = new TaskOne();

        // Implementing Runnable
        TaskTwo m = new TaskTwo();
        Thread t2 = new Thread(m);

        // start both Thread
        t1.start();
        t2.start();

    }

}
