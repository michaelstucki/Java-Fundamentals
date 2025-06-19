package labs_examples.objects_classes_methods.labs.oop.A_inheritance.animalFun;

public class Lion extends Feline {
    public Lion(String food) {
        this.food = food;
    }

    @Override
    public void makeNoise() {
        System.out.println("Roaring like a Lion!");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + food + " like a Lion!");
    }
}
