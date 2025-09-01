package labs_examples.datastructures.hashmap.labs;

/*
 *      HashMaps Exercise_02
 *
 * DONE
 *      Rewrite the CustomHashMap class to meet the following requirements:
 * DONE
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 * DONE
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 * DONE
 *      3) resize the HashMap when the underlying array is more than half full
 * DONE
 *      4) triple the size of the underlying array on resize()
 * DONE
 *      5) instead of checking the number of keys to resize, check the number of values
 *          but much easier and more efficient to use a simple counter for nodes added or deleted
 *          why add needless code complexity and execution time?
 * DONE
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 * DONE
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 * DONE
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyHashMap<String, Integer> mhm = new MyHashMap<>();
        mhm.add("A", 10);
        mhm.add("B", 20);
        mhm.add("C", 30);
        mhm.add("D", 40);
        mhm.add("E", 50);
        mhm.add("F", 60);
        mhm.add("A", 100);
        mhm.printHashMap();
        System.out.println(mhm.get("F"));
        System.out.println(mhm.get("Z"));
        mhm.change("A", 222);
        mhm.printHashMap();
        mhm.change("Z", 222);
        System.out.println(mhm.delete("A"));
        mhm.printHashMap();
        System.out.println(mhm.delete("B"));
        mhm.printHashMap();
        System.out.println(mhm.delete("ZZ"));
        mhm.printHashMap();
        System.out.println(mhm.delete("C"));
        mhm.printHashMap();
        System.out.println(mhm.delete("D"));
        mhm.printHashMap();
        System.out.println(mhm.delete("E"));
        mhm.printHashMap();
        System.out.println(mhm.delete("F"));
        mhm.printHashMap();
        System.out.println(mhm.delete("F"));
        mhm.printHashMap();
    }
}

class MyHashMap<K, V> {
    private Node<K,V>[] data = new Node[4];
    private int numNodes = 0; // number of nodes in hashmap

    // Adds a node to hashmap
    public void add(K key, V value) {
        Node<K, V> node = new Node<>(key, value);
        put(node, data);
        numNodes++;
        if ((double) numNodes / data.length >= 0.5) resize();
    }

    // Resizes hashmap
    public void resize() {
        Node<K, V>[] tmp = new Node[data.length * 3];
        for (Node<K,V> node : data) {
            if (node == null) continue;
            put(node, tmp);
            Node<K, V> cursor = node;
            while(cursor.next != null) {
                put(node, tmp);
                cursor = cursor.next;
            }
        }
        data = tmp;
    }

    // Gets node for key
    public Node<K, V> get(K key) {
        Node<K, V> node = null;
        int position = key.hashCode() % data.length;
        Node<K, V> cursor = data[position];
        if (cursor != null) {
            while(cursor != null) {
                if (cursor.key == key) {
                    node = cursor;
                    break;
                } else {
                    cursor = cursor.next;
                }
            }
        }
        if (node == null) System.out.println("key: " + key + " does not exist in hashmap");
        return node;
    }

    // Changes value for key
    public void change(K key, V value) {
        Node<K, V> node = get(key);
        if (node != null) node.value = value;
    }

    // Deletes node from hashmap
    public Node<K, V> delete(K key) {
        Node<K, V> node = null;
        int position = key.hashCode() % data.length;
        Node<K, V> cursor = data[position];
        if (cursor != null) {
            while (cursor != null) {
                if (cursor.key == key) {
                    node = cursor;
                    numNodes--;
                    // a single node in list
                    if (node.prev == null && node.next == null) {
                        data[position] = null;
                    }
                    // the head node
                    else if (node.prev == null) {
                        data[position] = node.next;
                        node.next.prev = node.prev;
                    }
                    // the tail node
                    else if (node.next == null) {
                        node.prev.next = node.next;
                        node.prev = null;
                    }
                    // a middle node
                    else {
                        node.prev.next = node.next;
                        node.next.prev = node.prev;
                        node.prev = null;
                    }
                }
                cursor = cursor.next;
            }
        }
        if (node == null) System.out.println("key: " + key + " does not exist in hashmap");
        return node;
    }

    /*
     *  Utility method, puts a node in hashmap
     *  Changes value of existing key
     *  Collisions are prepended to the list
     */
    private void put(Node<K, V> node, Node<K, V>[] tmp) {
        int position = node.key.hashCode() % tmp.length;
        if (tmp[position] != null) {
            Node<K, V> cursor = tmp[position];
            // change value for existing key
            if (cursor.key == node.key) {
                cursor.value = node.value;
                // decrement counter
                numNodes--;
                return;
            }
            node.next = cursor;
            cursor.prev = node;
        }
        tmp[position] = node;
    }

    // Prints all nodes in hashmap
    public void printHashMap() {
        for (Node<K,V> node : data) {
            if (node == null) continue;
            System.out.print(node + " ");
            Node<K, V> cursor = node;
            while(cursor.next != null) {
                System.out.print(cursor.next + " ");
                cursor = cursor.next;
            }
        }
        System.out.println();
    }

    // Node class
    class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;
        private Node<K, V> prev;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString() { return key + ":" + value; }
    }
}
