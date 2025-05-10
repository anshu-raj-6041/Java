package Threads.Synchronization;

class MyTh extends Thread {
    public void run() {
        int count = 1;
        while(true) {
            System.out.println(count++ + " From MyTh");
        }
    }

}

public class Q1 {
    public static void main(String[] args) {
        MyTh t = new MyTh();
        // t.setDaemon(true);
        t.start();

        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        // try {
        //     Thread.sleep(100);
        // }
        // catch(Exception e) {};

        int count = 1;
        while(true) {
            System.out.println(count++ + " From main");
            Thread.yield();
        }

    }

}
