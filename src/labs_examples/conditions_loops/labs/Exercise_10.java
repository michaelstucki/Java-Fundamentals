package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {

        // print odd numbers from 100 to 1 in descending order
        for(int i = 100; i >= 1; i--) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
