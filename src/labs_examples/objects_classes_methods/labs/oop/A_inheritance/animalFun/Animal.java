package labs_examples.objects_classes_methods.labs.oop.A_inheritance.animalFun;

public abstract class Animal {
    protected String food;

    public abstract void roam();
    public abstract void makeNoise();
    public abstract void eat();
    public void sleep() {
        System.out.println("I'm sleeping!");
    }
}
