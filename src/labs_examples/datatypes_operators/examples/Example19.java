package labs_examples.datatypes_operators.examples;

// A promotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed!!
//        b = b * b;

        System.out.println("i and b: " + i + " " + b);
    }
}