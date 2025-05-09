package Threads;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Q1ThreadTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start(); // use start() method

        int i = 1;
        while(true) {
            System.out.println(i + " World");
            i++;
        }
        
    }
    
}
