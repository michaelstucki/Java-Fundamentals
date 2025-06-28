package labs_examples.static_nonstatic.labs;

public class A {
    String name;

    public A(String name) { this.name = name; }

    public static void main(String[] args) {
        addStatic(1, 2);                    //(1) A static method calling another static method in the same class
        A a = new A("Hardy");
        a.print(a.name);                          //(2) A static method calling a non-static method in the same class
        B.printStatic("keep hope alive");     //(3) A static method calling a static method in another class

        B b = new B(true);
        System.out.println(b.isOn);               //(4) A static method calling a non-static method in another class

        a.print(a.getName());                     //(5) A non-static method calling a non-static method in the same class

        a.printOther(b, a.getName());             //(6) A non-static method calling a non-static method in another class
    }

    public static void addStatic(int x, int y) {
        int result = x + y;
        printStatic(x + " + " + y + " = " + result);
    }

    public static void printStatic(String str) {
        System.out.println(str);
    }

    public void print(String str) {
        System.out.println(str);
        printStatic(str);                          //(7) A non-static method calling a static method in the same class
        B.printStatic(str);                        //(8) A non-static method calling a static method in another class
    }

    public String getName() { return name; }

    public void printOther(B b, String str) {
        b.print(str);
    }
}
