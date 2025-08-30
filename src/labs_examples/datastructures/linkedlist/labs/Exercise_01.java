package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();     // 1
        ll.add("Hello");                                // 2
        ArrayList<String> al = new ArrayList<>();       // 3
        al.add("world");
        al.add("!");
        ll.addAll(al);
        ll.addFirst("first");                        // 4
        ll.addLast("last");                          // 5
        System.out.println(ll.getFirst());              // 6
        System.out.println(ll.getLast());               // 7
        System.out.println(ll.get(2));                  // 8
        ll.set(0, "I'm first!");                        // 9
        ll.push("more stuff");                       // 10
        System.out.println(ll.pop());                   // 11
        System.out.println(ll.remove(1));         // 12
        System.out.println(ll.contains("world"));       // 13
        ListIterator<String> it = ll.listIterator();    // 14
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        ll.clear();                                     // 15
        System.out.println(ll.isEmpty());
    }
}