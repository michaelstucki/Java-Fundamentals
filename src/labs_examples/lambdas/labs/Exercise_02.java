package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.function.*;

/*
 * Lambdas Exercise 2:
 * DONE
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
public class Exercise_02 {
    public static void main(String[] args) {
        // 01
        BiConsumer<String, Integer> bc = (s, i) -> System.out.println(s + " " + i);
        bc.accept("Hello", 7);
        // 02
        BiFunction<String, Integer, String> bf = (s, i) ->  s + " " + String.valueOf(i);
        System.out.println(bf.apply("Hello", 7));
        // 03
        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(5, 3));
        // 04
        BiPredicate<String, Integer> bp = (s, i) -> s.length() < i;
        System.out.println(bp.test("Hello", 7));
        // 05
        BooleanSupplier bs = () -> true;
        System.out.println(bs.getAsBoolean());
        // 06
        DoubleFunction<Integer> df = (d) -> (int) d;
        System.out.println(df.apply(3.14));
        // 07
        Function<String, Integer> f = String::length;
        System.out.println(f.apply("Mississippi"));
        // 08
        Predicate<String> p = s -> s.length() >= 10;
        System.out.println(p.test("ten"));
        // 09
        UnaryOperator<Integer> triple = i -> i * 3;
        System.out.println(triple.apply(24));
        // 10
        int[] numbers = {1, 5, 8, 12, 15, 20, 25};
        IntPredicate isEven = n -> n % 2 == 0;
        IntPredicate isGreaterThan10 = n -> n > 10;
        System.out.println("Numbers that are even and greater than 10:");
        Arrays.stream(numbers)
                .filter(isEven.and(isGreaterThan10))
                .forEach(System.out::println);
    }
}