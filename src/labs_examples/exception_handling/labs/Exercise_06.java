package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("main: before methodA call");
        methodA();
        System.out.println("main: after methodA call");
    }

    public static void methodA () {
        System.out.println("in methodA");
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("in methodA catch");
            System.out.println(e.getMessage());
        }
    }

    public static void methodB () throws Exception {
        System.out.println("in methodB");
        throw new Exception("exception generated in methodB");
    }
}
