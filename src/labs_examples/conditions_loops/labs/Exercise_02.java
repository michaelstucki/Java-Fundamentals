package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7 corresponding to the days of the week, e.g., 1 is Monday: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        String result;

        if (number < 1 || number > 7) {
            result = "Other";
        } else {
            if (number == 1) {
                result = "Monday";
            } else if (number == 2) {
                result = "Tuesday";
            } else if (number == 3) {
                result = "Wednesday";
            } else if (number == 4) {
                result = "Thursday";
            } else if (number == 5) {
                result = "Friday";
            } else if (number == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }
        }

        System.out.println(result);
    }
}
