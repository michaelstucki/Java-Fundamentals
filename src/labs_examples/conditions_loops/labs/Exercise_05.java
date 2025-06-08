package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user for lower bound number
        System.out.print("Enter a lower bound number: ");
        // assign input to variable as int
        int lower = scanner.nextInt();

        // prompt user for upper bound number
        System.out.print("Enter a upper bound number: ");
        // assign input to variable as int
        int upper = scanner.nextInt();

        int count = 0;
        int sum = 0;
        double average;

        // compute sum
        for (int i = lower; i <= upper; i++) {
            sum += i;
            count++;
        }

        // compute average
        average = (double) sum / count;

        System.out.println("Sum of numbers from " + lower + " to " + upper + " : " + sum);
        System.out.println("Average of numbers from " + lower + " to " + upper + " : " + average);
    }
}
