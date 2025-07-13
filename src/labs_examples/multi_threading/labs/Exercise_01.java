package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        Runnable_01 r01 = new Runnable_01();
        Thread t1 = new Thread(r01);
        t1.start();

        new Thread(r01).start();
    }
}

class Runnable_01 implements Runnable {
    public void run() {
        System.out.println("Hello!");
    }
}


