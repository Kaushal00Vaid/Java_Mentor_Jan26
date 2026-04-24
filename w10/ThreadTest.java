package w10;

public class ThreadTest {

    private static int counter = 0;

    public synchronized static void increment() {
        counter++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        // System.out.println("Final Counter: " + counter);

        try {
            t1.join(); // --> wait for t1 thread to complete its task
            t2.join();
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("Final Counter: " + counter);
    }
}
