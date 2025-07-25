package labs_examples.generics.examples;

// Use a generic constructor.
class Summation {
    private int sum;

    // the <...> is a descriptor
    // here is says the method type T must be a Number
    <T extends Number> Summation(T arg) {
        sum = 0;

        // add a comment: sum the values from 0 to arg
        for(int i=0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}

class GenConsDemo {
    public static void main(String args[]) {
        Summation ob = new Summation(4.0);
        System.out.println("Summation of 4.0 is " + ob.getSum());

        Summation ob1 = new Summation(10);
        System.out.println("Summation of 10 is " + ob1.getSum());
    }
}