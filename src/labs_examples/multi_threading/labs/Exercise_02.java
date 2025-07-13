package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 extends Thread {
    Exercise_02(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println("Hello, Exercise_02!");
    }

    public static void main(String[] args) {
        new Exercise_02("Exercise_02");
    }
}