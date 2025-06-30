package labs_examples.packages.labs;

import labs_examples.packages.labs.a.A;
import labs_examples.packages.labs.b.B;

public class Main {
    public static void main(String[] args) {
        A a = new A("World", 1000);
        System.out.println(a.toString());
//        System.out.println(a.getAge()); // has protected access in a.A, therefore not visible here

        // cannot  access B since B is in a different package and
        B b = new B();
//        System.out.println(b.getConstant()); // has protected access in b.B, therefore not visible here
//        System.out.println(b.isOff());       // ditto
    }
}
