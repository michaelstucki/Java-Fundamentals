package labs_examples.static_nonstatic.labs;

public class B {
    boolean isOn;

    public B(boolean isOn) { this.isOn = isOn; }

    public static void printStatic(String str) { System.out.println(str); }

    public boolean isOn() { return isOn; }

    public void print(String str) {
        System.out.println(str);
    }
}
