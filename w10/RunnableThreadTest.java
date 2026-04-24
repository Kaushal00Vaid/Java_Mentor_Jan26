package w10;

import java.lang.*;

// MyThread
class RunnableThread implements Runnable {

    // shared memory
    String name;

    // constructor
    RunnableThread(String n) {
        name = n;
    }

    // parallel
    // override run() from Thread class --> parallel
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " --> step " + i + "[thread " + Thread.currentThread().getName() + "]");

            // stuck task
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception occured");
            }
        }
    }
}

public class RunnableThreadTest {
    public static void main(String[] args) {
        // use RUnnable to create Threads
        Thread t1 = new Thread(new RunnableThread("Kaushal"));
        Thread t2 = new Thread(new RunnableThread("Dhruv"));

        t1.start();
        t2.start();

        // implements Runnable
        // override run() -- common in both
        // Thread in = new Thread(new RunnableClass(..));
    }
}
