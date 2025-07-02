package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise_04 {
    public static void main(String[] args) {
        try {
            try {
                int i = 1/0;
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            int[] arr = {0};
            int i = arr[1];
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
