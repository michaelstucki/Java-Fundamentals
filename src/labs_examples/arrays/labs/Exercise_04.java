package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2-dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] nums = {{1, 2, 3}, {4}, {5, 6, 7}};
        for(int[] array : nums) {
            for(int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
