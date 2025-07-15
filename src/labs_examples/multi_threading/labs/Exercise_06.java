package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
public class Exercise_06 implements Runnable {
    public static int count = 0;
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 49; i++) {
                count++;
                Thread t = Thread.currentThread();
                if (t.getName().equalsIgnoreCase("even") && count % 2 == 0) {
                    System.out.print(count + " ");
                    notify();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (t.getName().equalsIgnoreCase("odd") && count % 2 != 0) {
                    System.out.print(count + " ");
                    notify();
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
        Exercise_06 r = new Exercise_06();
        Thread t1 = new Thread(r, "odd");
        Thread t2 = new Thread(r, "even");
        t1.start();
        t2.start();
    }
}