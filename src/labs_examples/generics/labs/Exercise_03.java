package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println(d.sum(3.1, 1));
        ArrayList<String> words = new ArrayList<>();
        words.add("abba"); words.add(null); words.add("Michael"); words.add("ullu");
        System.out.println(d.numberOfPalindromes(words));

        Integer[] items = {1, 2, 3};
        for (Integer item : items) System.out.print(item + " ");
        System.out.println();
        d.exchangePosition(items, 0, 2);
        for (Integer item : items) System.out.print(item + " ");
        System.out.println();
        d.exchangePosition(items, 0, 3);
        for (Integer item : items) System.out.print(item + " ");
        System.out.println();

        String[] items2 = {"a", "b", "c"};
        for (String item : items2) System.out.print(item + " ");
        System.out.println();
        d.exchangePosition(items2, 0, 2);
        for (String item : items2) System.out.print(item + " ");
        System.out.println();
        d.exchangePosition(items2, 0, 3);
        for (String item : items2) System.out.print(item + " ");
        System.out.println();
    }
}

class Demo1 {
    public <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public <T extends String> int numberOfPalindromes(ArrayList<T> words) {
        int result = 0;
        for (String word : words) {
            if (isPalindrome(word)) ++result;
        }
        return result;
    }

    private boolean isPalindrome(String str) {
        if (str == null) return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    public <T> void exchangePosition(T[] arr, int i, int j) {
        if (i < 0 || i > arr.length - 1) return;
        if (j < 0 || j > arr.length - 1) return;
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
