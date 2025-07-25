package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

public class Exercise_02 {
    public static void main(String[] args) {
        Demo d = new Demo();
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1); nums1.add(2); nums1.add(3);
        System.out.println(d.sum(nums1));

        ArrayList<Double> nums2 = new ArrayList<>();
        nums2.add(3.0); nums2.add(4.2);
        System.out.println(d.sum(nums2));
    }
}

class Demo{
    public <T extends Number> double sum(ArrayList<T> nums) {
        Double result = 0.0;
        for (T num : nums) result += num.doubleValue();
        return result;
    }
}