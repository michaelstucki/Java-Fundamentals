package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.List;

/*
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {
    public static void main(String[] args) {
        LinkedList03<String> ll = new LinkedList03<>();
        ll.push("Hello");
        ll.push("World!");
        ll.push("Again?");
        System.out.println(ll.size());
        System.out.println(ll.getList());
        System.out.println(ll.pop());
        ll.append("Caboose");
        ll.append("another car");
        ll.append("yet another car!");
        System.out.println(ll.size());
        System.out.println(ll.getList());
        System.out.println(ll.remove());
        System.out.println(ll.size());
        System.out.println(ll.getList());
    }
}

class LinkedList03<T> {
    private X<T> head;

    // push element to beginning
    public void push(T element) {
        X<T> node = new X<>(element);
        if (head != null) {
            node.setNext(head);
            head.setPrev(node);
        }
        head = node;
    }

    // pop element from beginning
    public T pop() {
        if (head == null) return null;
        X<T> node = head;
        head = node.getNext();
        head.setPrev(null);
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
            node.setPrev(cursor);
        }
    }

    // remove element from the end
    public T remove() {
        if (head == null) return null;
        X<T> cursor = head;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        cursor.getPrev().setNext(null);
        cursor.setPrev(null);
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
        private X<T> next, prev;
        public X(T data) { this.data = data; }
        public X<T> getNext() { return next; }
        public X<T> getPrev() { return prev; }
        public void setNext(X<T> next) { this.next = next; }
        public void setPrev(X<T> prev) { this.prev = prev; }
        public T getData() { return data; }
    }
}
