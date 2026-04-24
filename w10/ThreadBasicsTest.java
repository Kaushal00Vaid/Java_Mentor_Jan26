package w10;

import java.lang.*;

// MyThread
class MyThread extends Thread {

    // shared memory
    String name;

    // constructor
    MyThread(String n) {
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

public class ThreadBasicsTest {
    public static void main(String[] args) {
        // 2 concurrent computation
        // MyThread t1 = new MyThread("Kaushal");
        // MyThread t2 = new MyThread("Dhruv");

        // // not the correct way --> sequentially
        // // t1.run();
        // // t2.run();

        // t1.start(); // --> run() the thread in parallel behaviour
        // t2.start();

        MyThread[] p = new MyThread[5]; // [new Thread(..) , .., .., ..]

        for (int i = 0; i < 5; i++) {
            p[i] = new MyThread("Kaushal" + i);
            p[i].start();
        }
    }
}