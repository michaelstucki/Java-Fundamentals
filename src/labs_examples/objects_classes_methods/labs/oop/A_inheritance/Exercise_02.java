package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10, because:
 * 1. new B() results in the invocation of the B constructor.
 * 2. since B lacks a constructor, the compiler adds a default constructor to B.
 * 3. when B's default constructor is called it first calls A's constructor.
 * 4. since A lacks a constructor, the compiler adds a default constructor to A.
 * 5. this constructor assigns a value of 10 to A's instance variable i.
 * 6. But the B object's reference is assigned to a variable of class A.
 * 7. This class A reference only has access to A class members such as i (this is the root cause).
 * 8. So, A.i is 10;
 * NB. changing i to j in class B, shows in intellij that a.j is not available, that is class B's j cannot be seen
 *  by an A class reference variable.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int j = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
//        System.out.println(a.j); // j is not available to a since a is of type A
    }
}