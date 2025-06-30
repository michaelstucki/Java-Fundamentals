package labs_examples.packages.labs.a;

public class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    protected int getAge() { return age; }

    @Override
    public String toString() {
        return "A{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
