package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("the");
        words.add("rain");
        words.add("in");
        words.add("Spain");
        words.add("stays");
        words.add("mainly");
        words.add("on");
        words.add("the");
        words.add("plain");
        for(String word : words) System.out.print(word + " ");
        System.out.println();

        words.sort(Comparator.naturalOrder());
        for(String word : words) System.out.print(word + " ");
        System.out.println();

        words.sort(Comparator.reverseOrder());
        for(String word : words) System.out.print(word + " ");
        System.out.println();

        while(!words.isEmpty()) {
            System.out.println("size of words: " + words.size());
            System.out.print(words.getFirst() + " ");
            words.removeFirst();
        }
        System.out.println("size of words: " + words.size());
    }
}
