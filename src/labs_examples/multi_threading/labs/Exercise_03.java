package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

class Exercise_03 implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Exercise_03(), "01");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        Thread t2 = new Thread(new Exercise_03(), "02");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("Hello, Exercise_03 " + Thread.currentThread().getName());
    }
}