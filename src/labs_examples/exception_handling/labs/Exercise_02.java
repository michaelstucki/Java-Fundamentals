package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class Exercise_02 {
    public static void main(String[] args) {
        try {
//            String s = null;
//            s.length();
//            int[] a = {0};
//            int i = a[1];
            int r = 1/0;
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}

