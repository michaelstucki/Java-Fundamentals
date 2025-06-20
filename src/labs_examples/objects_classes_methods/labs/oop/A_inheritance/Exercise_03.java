package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer: because as a rule:
 * 1. when a subclass constructor is invoked, the first command executed in it is an invocation of its superclass constructor
 *    and this occurs automatically when no constructors are defined.
 * 2. so, since C_1 extends B_1, when new C_1() is run, the C_1 default constructor first calls B_1's default constructor.
 * 3. but since B_1 extends A_1, this results in the invocation of A_1's default constructor.
 * 4. therefore, the order of constructor calls (as shown by the messages): is A_1, then B_1, then C_1.
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
