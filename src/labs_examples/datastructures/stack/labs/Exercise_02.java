package labs_examples.datastructures.stack.labs;

/*
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize a new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyStack<String> ms = new MyStack<>();
        System.out.println(ms.size());
        ms.print();
        ms.push("A");
        ms.push("B");
        ms.push("C");
        ms.push("D");
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.peekView());
        System.out.println(ms.peekLast());
        System.out.println(ms.pop());
        System.out.println(ms.size());
        System.out.println(ms.pop());
        System.out.println(ms.size());
        System.out.println(ms.pop());
        System.out.println(ms.size());
        System.out.println(ms.pop());
        System.out.println(ms.size());
        ms.print();
        System.out.println(ms.peekView());
        System.out.println(ms.peekLast());
    }
}

class MyStack<T> {
    @SuppressWarnings("unchecked")
    private T[] data = (T[]) new Object[4];
    private int size = data.length;
    private int cursor = 0;

    public void push(T element) {
        data[cursor++] = element;
        if ((double) cursor / size >= 0.75) resize(size * 2);
    }

    public T pop() {
        T tmp = null;
        try {
            if (cursor == 0) throw new StackArrayException("empty array");
            tmp = data[--cursor];
            data[cursor] = null;
            if ((double) cursor / size <= 0.25) resize(size / 2);
        } catch (StackArrayException e) {
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

    public T peekView() {
        T tmp = null;
        try {
            if (cursor == 0) throw new StackArrayException("empty stack");
            tmp = data[cursor - 1];
        } catch (StackArrayException e) {
            System.out.println(e.getMessage());
        }
        return tmp;
    }

    public T peekLast() {
        T tmp = null;
        try {
            if (cursor == 0) throw new StackArrayException("empty stack");
            tmp = data[0];
        } catch (StackArrayException e) {
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

class StackArrayException extends Exception {
    public StackArrayException(String message) {
        super(message);
    }
}