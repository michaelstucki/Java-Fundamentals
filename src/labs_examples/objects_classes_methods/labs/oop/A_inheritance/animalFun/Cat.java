package labs_examples.objects_classes_methods.labs.oop.A_inheritance.animalFun;

public class Cat extends Feline {
    public Cat(String food) {
        this.food = food;
    }

    @Override
    public void makeNoise() {
        System.out.println("Purring like a Cat!");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + food + " like a Cat!");
    }
}
