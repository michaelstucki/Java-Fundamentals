package labs_examples.generics.examples;

// NumericFns attempts (unsuccessfully) to create
// a generic class that can compute various
// numeric functions, such as the reciprocal or the
// fractional component, given any type of number.
// So, I will fix it.
// For this to work on numbers, it must upper bound the generic type to Number
class NumericFns<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue(); // Error!
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue(); // Error!
    }

    public static void main(String[] args) {
        NumericFns nf1 = new NumericFns(3.14);
        System.out.println(nf1.reciprocal());
        System.out.println(nf1.fraction());

        NumericFns nf2 = new NumericFns(2);
        System.out.println(nf2.reciprocal());
        System.out.println(nf2.fraction());
    }
}