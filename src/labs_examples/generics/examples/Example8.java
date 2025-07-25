package labs_examples.generics.examples;

class UseBoundedWildcard {
    // Here, the ? will match A or any class type that
    // that extends A
    static void test(Gen2<? extends A> o) {
        System.out.println(o.ob.getClass().getName());
    }
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen2<A> w = new Gen2<A>(a);
        Gen2<B> w2 = new Gen2<B>(b);
        Gen2<C> w3 = new Gen2<C>(c);
        Gen2<D> w4 = new Gen2<D>(d);

        // These calls to test() are OK.
        test(w);
        test(w2);
        test(w3);

        // Can't call test() with w4 because
        // it is not an object of a class that
        // inherits A.
//    test(w4); // Error!
    }
}