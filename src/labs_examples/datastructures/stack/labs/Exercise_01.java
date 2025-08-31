package labs_examples.datastructures.stack.labs;

/*
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5 (there are lots!, I did 10)
 */

import java.util.Stack;

public class Exercise_01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Hello!");
        stack.add("World");
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        stack.push("more stuff");
        stack.addFirst("i'm first!");
        stack.addLast("i'm last!");
        System.out.println(stack.contains("Hello!"));
        System.out.println();
        stack.forEach(System.out::println);
        stack.clear();
    }
}