package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
public class Exercise_04 implements Runnable {
    private static int count = 0;
    public synchronized static void increment() {
        count++;
        System.out.print(count + " ");
    }

    public void run() {
        A a = new A();
        for (int i = 0; i < 20; i++) increment();
        for (int i = 0; i < 20; i++) {
            synchronized (a) {
                a.increment();
            }
        }
    }

    public static void main(String[] args) {
        Exercise_04 a = new Exercise_04();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
    }
}

class A {
    private int count = 1000;
    public void increment() {
        count++;
        System.out.print(count + " ");
    }
}