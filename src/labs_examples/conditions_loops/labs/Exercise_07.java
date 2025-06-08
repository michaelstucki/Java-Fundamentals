package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a word: ");
        // assign input to variable as String
        String word = scanner.next();

        char firstVowel = '\0';

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'A' ||
                letter == 'e' || letter == 'E' ||
                letter == 'i' || letter == 'I' ||
                letter == 'o' || letter == 'O' ||
                letter == 'u' || letter == 'U') {
                firstVowel = letter;
                break;
            }
        }

        System.out.println("You entered " + word);
        if (firstVowel == '\0') {
            System.out.println("The word has no vowels");
        } else {
            System.out.println("First vowel is: " + firstVowel);
        }
    }
}
