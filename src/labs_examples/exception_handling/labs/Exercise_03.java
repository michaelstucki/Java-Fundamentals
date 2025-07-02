package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Exercise_03 {
    public static void main(String[] args) {
        try {
            int i = 1/0;
            return;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            return;
        } finally {
            System.out.println("finally");
        }
    }
}
