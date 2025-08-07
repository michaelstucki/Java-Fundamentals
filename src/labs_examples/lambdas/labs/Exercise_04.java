package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 * DONE     1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * DONE     2) Demonstrate the use of the sum function to determine the sum of a set of numbers.
 * DONE     3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 * DONE     4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 * DONE     5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * DONE     6) Demonstrate how to Stream a text file and print out each line
 * DONE     7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 * DONE     8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 * DONE     9) Demonstrate the anyMatch() function.
 * DONE     10) Demonstrate the allMatch() function.
 * TODO     11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example_04 {
    public static void main(String[] args) {
        // 01
        IntStream.range(1, 16).forEach(System.out::print);
        // 02
        int sum = IntStream.range(1, 16).sum();
        System.out.println("\n" + sum);
        // 03
        sum = IntStream.range(1, 16).map(x -> x * x).sum();
        System.out.println(sum);
        // 04
        double average = IntStream.range(1, 16).filter(x -> x >= 10).average().getAsDouble();
        System.out.println(average);
        // 05
        sum = Arrays.stream(new int[] {1, 2, 3, 4}).reduce(0, Integer::sum);
        System.out.println(sum);
        // 06
        String dataFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Path path = Paths.get(dataFile);
        try (Stream<String> rows = Files.lines(path)) {
            rows.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 07
        try (Stream<String> rows = Files.lines(path) ) {
            rows.map(s -> s.split(",")).forEach(e -> System.out.println(e[1]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 08
        try (Stream<String> rows = Files.lines(path)) {
            double result = rows.map(s -> s.split(",")).map(e -> Double.parseDouble(e[2])).reduce(0.0, Double::sum);
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 09
        int[] numbers09 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean anyEven = Arrays.stream(numbers09).anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);
        // 10
        boolean allEven = Arrays.stream(numbers09).allMatch(n -> n % 2 == 0);
        System.out.println(allEven);
        // 11
        Stream<Integer> stream10 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers10 = stream10.map(n -> n * 2).collect(Collectors.toList());
        numbers10.forEach(System.out::println);
    }
}
