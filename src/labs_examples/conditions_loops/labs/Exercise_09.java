package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        // sum integers from 1 to 1000 until the sum exceeds 500
        int sum = 0;

        for(int i = 1; i <= 1000; i++) {
            sum += i;
            if (sum > 500) break;
        }

        System.out.println(sum);
    }
}
