package Sem.Threads;
// change the priority of Thread

class MyThread extends Thread {
    // constructor
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }

}

public class Q8 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
        t3.start();

    }

}
