package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */
public class Exercise_05 implements Runnable {
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                if (Thread.currentThread().getName().equalsIgnoreCase("hello")) {
                    notify();
                    System.out.print("Hello! ");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    notify();
                    System.out.print("Goodbye! ");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            notify();
        }
    }

    public static void main(String[] args) {
        Exercise_05 r = new Exercise_05();
        Thread t1 = new Thread(r, "hello");
        Thread t2 = new Thread(r, "goodbye");
        t1.start();
        t2.start();
    }
}
