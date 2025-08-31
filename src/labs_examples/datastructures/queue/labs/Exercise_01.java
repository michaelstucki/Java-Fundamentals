package labs_examples.datastructures.queue.labs;

/*
 *      Demonstrate your mastery of Java's built-in Queue interface. You'll need to do a little 
 *      research here. What classes can you import that implement the Queue interface? Find one
 *      that you'd like to explore and use for this exercise. 
 *      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class you're implementing 
 */

import java.util.LinkedList;
import java.util.Queue;

public class Exercise_01 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(100);
        q.add(34);
        q.add(1020);
        System.out.println(q.element());
        q.offer(-120);
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println();
        q.forEach(System.out::println);
    }
}