package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {

        // Method overloading
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));

        // Pass by reference
        Person person = new Person();
        person.firstName = "Cicero";
        System.out.println(person.firstName);
        changeName(person);
        System.out.println(person.firstName);
        // Pass by value
        int a = 0;
        System.out.println(a);
        changeNumber(a);
        System.out.println(a);

        // Largest of four
        System.out.println(largestOfFour(1, 2, 3, 4));

        // Number of consonants
        System.out.println(numberOfConsonants("Mississippi"));

        // Is prime?
        System.out.println(isPrime(5));
        System.out.println(isPrime(4));

        // Get min, max
        int[] array = {1, 2, 3, 4};
        for(int num : array) System.out.print(num + " ");
        System.out.println();
        int[] arrayMaxMin = maxMin(array);
        for(int num : arrayMaxMin) System.out.print(num + " ");
        System.out.println();

        // Get divisibles
        ArrayList<Integer> divs = divisible(100, 2, 5);
        for(int num : divs) System.out.print(num + " ");
        System.out.println();
        System.out.println(divs.size());

        // Reverse int array
        int[] numbers = {1, 2, 4, 5};
        for(int num : numbers) System.out.print(num + " ");
        System.out.println();
        int[] numbersReversed = reverseIntArray(numbers);
        for(int num : numbers) System.out.print(num + " ");
        System.out.println();
        for(int num : numbersReversed) System.out.print(num + " ");
        System.out.println();

        // More Reverse int array
        int[] numbersMore = {100, 99, 98, 97, 96};
        for(int num : numbersMore) System.out.print(num + " ");
        System.out.println();
        reverseIntArrayInplace(numbersMore);
        for(int num : numbersMore) System.out.print(num + " ");
        System.out.println();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void changeName(Person person) {
        person.firstName = "Julius";
    }

    static void changeNumber(int a) {
        a++;
        System.out.println(a);
    }

    static int largestOfFour(int a, int b, int c, int d) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;
        return largest;
    }

    static int numberOfConsonants(String word) {
        int numConsonants = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'A') continue;
            if (c == 'e' || c == 'E') continue;
            if (c == 'i' || c == 'I') continue;
            if (c == 'o' || c == 'O') continue;
            if (c == 'u' || c == 'U') continue;
            numConsonants++;
        }
        return numConsonants;
    }

    static boolean isPrime(int num) {
        boolean isPrime = true;
        for(int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static int[] maxMin(int[] nums) {
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }

        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }

        return new int[]{min, max};
    }

    static ArrayList<Integer> divisible(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> divisibles = new ArrayList<>();
        for (int i = 0; i <= maxNum; i++) {
            if ((i % divisor1 == 0) && (i % divisor2 == 0)) divisibles.add(i);
        }
        return divisibles;
    }

    static int[] reverseIntArray(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }

    static void reverseIntArrayInplace(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }
}

class Person {
    String firstName;
}
