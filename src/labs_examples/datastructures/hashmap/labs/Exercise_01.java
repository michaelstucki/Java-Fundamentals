package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate your mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  DONE put()
 *  DONE get()
 *  DONE putAll()
 *  DONE size()
 *  DONE containsKey()
 *  DONE keySet()
 *  DONE entrySet()
 *  DONE putIfAbsent()
 *  DONE remove()
 *  DONE replace()
 *  DONE forEach()
 *  DONE clear()
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        System.out.println(hm.get("A"));

        System.out.println(hm.size());
        System.out.println(hm.containsKey("A"));
        System.out.println(hm.containsKey("Z"));
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        hm.putIfAbsent("A", 1);
        System.out.println(hm.entrySet());
        hm.putIfAbsent("C", 3);
        System.out.println(hm.entrySet());
        System.out.println(hm.remove("A"));
        System.out.println(hm.entrySet());
        hm.replace("C", 33);
        System.out.println(hm.entrySet());
        hm.forEach((letter, number) -> System.out.println(letter + ": " + number));
        hm.clear();
        System.out.println(hm.entrySet());
        Map<String, Integer> more = new HashMap<>();
        more.put("Apple", 1);
        more.put("Pear", 11);
        more.put("Kiwi", 111);
        hm.putAll(more);
        System.out.println(hm.entrySet());
    }
}