package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class Exercise_07 {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }

    public static void method() throws MyException {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new MyException();
        }
    }
}

class MyException extends Exception {
    @Override
    public String toString() {
        return "my exception";
    }
}