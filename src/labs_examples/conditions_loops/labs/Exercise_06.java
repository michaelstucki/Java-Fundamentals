package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop to find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while(i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to 100 is: " + sum);
    }
}
