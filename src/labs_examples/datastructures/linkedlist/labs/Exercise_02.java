package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.List;

/*
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should allow users
 *      to add and remove elements ONLY from the front of the list AND the end of the list.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        LinkedList02<String> ll = new LinkedList02<>();
        ll.push("Hello");
        ll.push("World!");
        System.out.println(ll.pop());
        ll.append("Caboose");
        ll.append("another car");
        System.out.println(ll.remove());
        System.out.println(ll.size());
        System.out.println(ll.getList());
    }
}

class LinkedList02<T> {
    private X<T> head;

    // add element to beginning
    public void push(T element) {
        X<T> node = new X<>(element);
        if (head != null) node.setNext(head);
        head = node;
    }

    // pop element from beginning
    public T pop() {
        if (head == null) return null;
        X<T> node = head;
        head = node.getNext();
        return node.getData();
    }

    // add element to end
    public void append(T element) {
        X<T> node = new X<>(element);
        if (head == null) {
            head = node;
        } else {
            X<T> cursor = head;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(node);
        }
    }

    // remove element from the end
    public T remove() {
        if (head == null) return null;
        X<T> cursor = head;
        X<T> precursor = cursor;
        while (cursor.getNext() != null) {
            precursor = cursor;
            cursor = cursor.getNext();
        }
        precursor.setNext(null);
        return cursor.getData();
    }

    // get the size of the list
    public int size() {
        int size = 0;
        if (head != null) {
            size = 1;
            X<T> cursor = head;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
                size++;
            }
        }
        return size;
    }

    // get a list of the list
    public List<T> getList() {
        List<T> list = null;
        if (head != null) {
            list = new ArrayList<>();
            X<T> cursor = head;
            do {
                list.add(cursor.getData());
                cursor = cursor.getNext();
            } while (cursor != null);
        }
        return list;
    }

    class X<T> {
        private T data;
        private X<T> next;
        public X(T data) { this.data = data; }
        public X<T> getNext() { return next; }
        public void setNext(X<T> next) { this.next = next; }
        public T getData() { return data; }
    }
}

