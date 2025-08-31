package labs_examples.datastructures.queue.labs;

/*
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyQueue<String> ms = new MyQueue<>();
        ms.enqueue("A");
        ms.enqueue("B");
        ms.enqueue("C");
        ms.enqueue("D");
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.peekView());
        System.out.println(ms.peekLast());
        System.out.println(ms.dequeue());
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.dequeue());
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.dequeue());
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.dequeue());
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.dequeue());
        System.out.println(ms.size());
        ms.print();
        ms.print();
        System.out.println(ms.peekView());
        System.out.println(ms.peekLast());
    }
}

class MyQueue<T> {
    @SuppressWarnings("unchecked")
    private T[] data = (T[]) new Object[4];
    private int size = data.length;
    private int cursor = 0;

    public void enqueue(T element) {
        data[cursor++] = element;
        if ((double) cursor / size >= 0.75) resize(size * 2);
    }

    public T dequeue() {
        T tmp = null;
        try {
            if (cursor == 0) throw new QueueArrayException("empty array");
            tmp = data[0];
            for (int i = 0; i < cursor - 1; i++) data[i] = data[i + 1];
            cursor--;
            if ((double) cursor / size <= 0.25) resize(size / 2);
        } catch (QueueArrayException e) {
            System.out.println(e.getMessage());
        }
        return tmp;
    }

    public void resize(int newSize) {
        @SuppressWarnings("unchecked")
        T[] tmp = (T[]) new Object[newSize];
        if (newSize > size) {
            if (size >= 0) System.arraycopy(data, 0, tmp, 0, size);
        } else {
            System.arraycopy(data, 0, tmp, 0, newSize);
        }
        data = tmp;
        size = newSize;
    }

    public T peekLast() {
        T tmp = null;
        try {
            if (cursor == 0) throw new QueueArrayException("empty stack");
            tmp = data[cursor - 1];
        } catch (QueueArrayException e) {
            System.out.println(e.getMessage());
        }
        return tmp;
    }

    public T peekView() {
        T tmp = null;
        try {
            if (cursor == 0) throw new QueueArrayException("empty stack");
            tmp = data[0];
        } catch (QueueArrayException e) {
            System.out.println(e.getMessage());
        }
        return tmp;
    }

    public void print() {
        for(int i = 0; i < cursor; i++) System.out.print(data[i] + " ");
        System.out.println();
    }

    public int size() { return cursor; }
}

class QueueArrayException extends Exception {
    public QueueArrayException(String message) {
        super(message);
    }
}