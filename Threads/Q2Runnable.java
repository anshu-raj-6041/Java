package Threads;
// implementing Runnable

class My implements Runnable {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Q2Runnable {
    public static void main(String[] args) {
        My m1 = new My();   // cabin
        Thread t1 = new Thread(m1); // horse
        t1.start();

        int i = 1;
        while(true) {
            System.out.println(i + " World");
            i++;
        }
        
    }
    
}
