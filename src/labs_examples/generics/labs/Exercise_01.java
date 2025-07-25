package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        X x1 = new X(1, 2.0);
        System.out.println(x1.getT() + " " + x1.getV());
        X x2 = new X("Hello!", 3.14f);
        System.out.println(x2.getT() + " " + x2.getV());
    }
}

class X<T, V> {
    T t;
    V v;

    public X(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public T getT() { return t; }
    public V getV() { return v; }
}


