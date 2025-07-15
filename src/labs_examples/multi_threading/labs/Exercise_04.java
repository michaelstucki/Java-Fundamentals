package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
public class Exercise_04 implements Runnable {
    private static int low = 0;
    private static char high = 'z' + 1;

    // synchronized method
    private synchronized void increment() {
        low++;
        System.out.print(low + " ");
    }

    // synchronized block
    private void decrement() {
        synchronized (this) {
            high--;
            System.out.print(high + " ");
        }
    }

    public void run() {
        for (int i = 0; i < 3; i++) increment();
        for (int i = 0; i < 3; i++) decrement();
    }

    public static void main(String[] args) {
        Exercise_04 r = new Exercise_04();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
