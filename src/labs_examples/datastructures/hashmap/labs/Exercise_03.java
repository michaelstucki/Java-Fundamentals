package labs_examples.datastructures.hashmap.labs;

/*
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      use nanoseconds (ns) for more precision
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

import java.util.*;

public class Exercise_03 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[100];
        for(int i = 99; i >= 0; i--) numbers[i] = i;

        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("\nLinkedList");
        // Add items
        long startTime = System.nanoTime();
        for (Integer number : numbers) ll.add(number);
        long endTime = System.nanoTime();
        long durationLLAdd = endTime - startTime;
        System.out.println("Add duration (ns): " + durationLLAdd);

        // Update items
        startTime = System.nanoTime();
        for (Integer number : numbers) { ll.set(ll.indexOf(number), number * 1); }
        endTime = System.nanoTime();
        long durationLLUpdate = endTime - startTime;
        System.out.println("Update duration (ns): " + durationLLUpdate);

        // Search items
        startTime = System.nanoTime();
        for (Integer number : numbers) { ll.indexOf(number); }
        endTime = System.nanoTime();
        long durationLLSearch = endTime - startTime;
        System.out.println("Search duration (ns): " + durationLLSearch);

        // Delete items
        startTime = System.nanoTime();
        for (Integer number : numbers) { ll.remove(number); }
        endTime = System.nanoTime();
        long durationLLDelete = endTime - startTime;
        System.out.println("Delete duration (ns): " + durationLLDelete);

        // Total duration
        long totalLL = durationLLAdd + durationLLUpdate + durationLLSearch + durationLLDelete;
        System.out.println("total duration (ns): " + totalLL);

        // Stack
        System.out.println("\nStack");
        Stack<Integer> stack = new Stack<>();
        // Add items
        startTime = System.nanoTime();
        for (Integer number : numbers) stack.push(number);
        endTime = System.nanoTime();
        long durationStackAdd = endTime - startTime;
        System.out.println("Add duration (ns): " + durationStackAdd);

        // Update items
        startTime = System.nanoTime();
        for (Integer number : numbers) { stack.set(stack.indexOf(number), number * 1); }
        endTime = System.nanoTime();
        long durationStackUpdate = endTime - startTime;
        System.out.println("Update duration (ns): " + durationStackUpdate);

        // Search items
        startTime = System.nanoTime();
        for (Integer number : numbers) { stack.search(number); }
        endTime = System.nanoTime();
        long durationStackSearch = endTime - startTime;
        System.out.println("Search duration (ns): " + durationStackSearch);

        // Delete items
        startTime = System.nanoTime();
        for (Integer number : numbers) { stack.remove(number); }
        endTime = System.nanoTime();
        long durationStackDelete = endTime - startTime;
        System.out.println("Delete duration (ns): " + durationStackDelete);

        // Total duration
        long totalStack = durationStackAdd + durationStackUpdate + durationStackSearch + durationStackDelete;
        System.out.println("total duration (ns): " + totalStack);

        // Queue
        System.out.println("\nQueue");
        Queue<Integer> queue = new LinkedList<>();
        // Add items
        startTime = System.nanoTime();
        for (Integer number : numbers) queue.add(number);
        endTime = System.nanoTime();
        long durationQueueAdd = endTime - startTime;
        System.out.println("Add duration (ns): " + durationQueueAdd);

        // Update items
        startTime = System.nanoTime();
        Queue<Integer> queueMod = new LinkedList<>();
        while(!queue.isEmpty()) queueMod.add(queue.poll() * 1);
        endTime = System.nanoTime();
        long durationQueueUpdate = endTime - startTime;
        System.out.println("Update duration (ns): " + durationQueueUpdate);

        // Search items
        startTime = System.nanoTime();
        for (Integer number : numbers) { queue.contains(number); }
        endTime = System.nanoTime();
        long durationQueueSearch = endTime - startTime;
        System.out.println("Search duration (ns): " + durationQueueSearch);

        // Delete items
        startTime = System.nanoTime();
        for (Integer number : numbers) { queue.remove(number); }
        endTime = System.nanoTime();
        long durationQueueDelete = endTime - startTime;
        System.out.println("Delete duration (ns): " + durationQueueDelete);

        // Total duration
        long totalQueue = durationQueueAdd + durationQueueUpdate + durationQueueSearch + durationQueueDelete;
        System.out.println("total duration (ns): " + totalQueue);

        // Hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        System.out.println("\nHashmap");
        // Add items
        startTime = System.nanoTime();
        for (Integer number : numbers) hm.put(number, number);
        endTime = System.nanoTime();
        long durationHashMapAdd = endTime - startTime;
        System.out.println("Add duration (ns): " + durationHashMapAdd);

        // Update items
        startTime = System.nanoTime();
        for (Integer number : numbers) { hm.replace(number, number * 1); }
        endTime = System.nanoTime();
        long durationHashMapUpdate = endTime - startTime;
        System.out.println("Update duration (ns): " + durationHashMapUpdate);

        // Search items
        startTime = System.nanoTime();
        for (Integer number : numbers) { hm.get(number); }
        endTime = System.nanoTime();
        long durationHashMapSearch = endTime - startTime;
        System.out.println("Search duration (ns): " + durationHashMapSearch);

        // Delete items
        startTime = System.nanoTime();
        for (Integer number : numbers) { hm.remove(number); }
        endTime = System.nanoTime();
        long durationHashMapDelete = endTime - startTime;
        System.out.println("Delete duration (ns): " + durationHashMapDelete);

        // Total duration
        long totalHashMap = durationHashMapAdd + durationHashMapUpdate + durationHashMapSearch + durationHashMapDelete;
        System.out.println("total duration (ns): " + totalHashMap);
    }
}