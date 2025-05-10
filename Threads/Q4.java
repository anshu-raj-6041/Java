package Threads;

// Thread methods

class MyT extends Thread {
    // Constructor
    public MyT(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);   // 10
        // setPriority(Thread.MAX_PRIORITY);   // 1
    }

    public void run() {
        int count = 1;
        while(true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) throws Exception {
        MyT t = new MyT("My Thread 1");

        // System.out.println("Alive " + t.isAlive());
        // System.out.println("Name " + t.getName());
        // System.out.println("Priority " + t.getPriority());
        // t.start();
        // System.out.println("State " + t.getState());


        t.start();

    }

}
