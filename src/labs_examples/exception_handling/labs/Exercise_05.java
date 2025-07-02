package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            System.out.println("in try");
            throwError();
        } catch (Exception e) {
            System.out.println("in catch");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    public static void throwError() throws Exception {
        throw new Exception("exception thrown in throwError");
    }

}