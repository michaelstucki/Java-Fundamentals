package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();
        System.out.println("Length of str: " + length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.contentEquals(str2);
        System.out.println("Is str equal to str2? " + isEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("str + str2: " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("Uppercase of str: " + str.toUpperCase());

        String userInput = "  Hi, there!  ";
        System.out.println(userInput);
        System.out.println(userInput.trim());
    }


}