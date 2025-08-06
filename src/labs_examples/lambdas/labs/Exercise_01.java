package labs_examples.lambdas.labs;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 * DONE
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 * DONE
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 * DONE
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 * DONE
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 * DONE
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 * DONE
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 * DONE
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        // 2)
        FI01 fi01a = () -> System.out.println("lambda");
        fi01a.fi01Method();
        FI01 fi01b = new FI01() {
            @Override
            public void fi01Method() {
                System.out.println("anonymous inner class");
            }
        };
        fi01b.fi01Method();
        // 4)
        FI02 fi02a = s -> s.toLowerCase();
        System.out.println(fi02a.fi02Method("HELLO"));
        FI02 fi02b = new FI02() {
            @Override
            public String fi02Method(String t) {
                return t.toUpperCase();
            }
        };
        System.out.println(fi02b.fi02Method("hello"));
        // 6)
        FI03 fi03a = (x, y) -> x * 7;
        System.out.println(fi03a.fi03Method(33, 11));
        FI03 fi03b = new FI03() {
            @Override
            public int fi03Method(int x, int y) {
                return x * 7;
            }
        };
        System.out.println(fi03b.fi03Method(12, 14));
        // 7)
        Predicate<String> p01 = s -> s.contains("a");
        System.out.println(p01.test("Alabama"));
        BiPredicate<String, Integer> p02 = (s, i) -> s.length() > i;
        System.out.println(p02.test("Alabama", 5));
    }
}

// 1)
@FunctionalInterface
interface FI01 { void fi01Method(); }
// 3
@FunctionalInterface
interface FI02 { String fi02Method(String t); }
// 5
@FunctionalInterface
interface FI03 { int fi03Method(int x, int y); }