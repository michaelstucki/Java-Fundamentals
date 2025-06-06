package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean isDayTime = true;
        char gamma = 'γ';
        byte age = 12;
        short fileOnDisk =  1_000;
        int hairOnHead = 100_000;
        long cellsInBody = 30_000_000_000_000L;
        float π = 3.1415927F;
        double G = 6.674E-11;

        System.out.println("Is it daytime? Ans. " + isDayTime);
        System.out.println("What's you favorite consonant? Ans. " + gamma);
        System.out.println("How old were you when you pitched in the little league? " + age);
        System.out.println("How many files are on disk? Ans. " + fileOnDisk);
        System.out.println("How many hairs are on your head? Ans. " + hairOnHead);
        System.out.println("How many cells are in your body? Ans. " +cellsInBody);
        System.out.println("What is the value of π? Ans. " + π);
        System.out.println("What is the Gravitational Constant (G) in metric units? Ans. " + G);
    }

}

