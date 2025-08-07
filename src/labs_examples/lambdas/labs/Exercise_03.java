package labs_examples.lambdas.labs;

import labs_examples.static_nonstatic.labs.B;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Lambdas Exercise 3:
 *
 * DONE     1) Demonstrate the use of a static method reference
 * DONE     2) Demonstrate the use of an instance method reference
 * DONE     3) Demonstrate the use of a constructor reference
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {
        // 03
        AGen ag = A::new;
        A a = ag.createA("Michael");
        // 01
        BiFunction<String, String, String> bf = (s1, s2) -> s1 + " " + s2;
        Function<String, String> f1 = A::getGreeting;
        String str = f1.apply("Charlotte");
        // 02
        System.out.println(str);
        IB ib = a::diplayName;
        ib.display();
    }
}

class A {
    String name;
    static String greeting = "Hello";
    public A(String name) { this.name = name; }
    public static String getGreeting(String name) { return greeting + ", " + name; }
    public void diplayName() { System.out.println(name); }
}

@FunctionalInterface
interface AGen { A createA(String name); }

@FunctionalInterface
interface IB { void display(); }