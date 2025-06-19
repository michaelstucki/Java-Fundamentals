package labs_examples.objects_classes_methods.labs.oop.A_inheritance.animalFun;

public class Dog extends Canine {
    public Dog(String food) {
        this.food = food;
    }

    @Override
    public void makeNoise() {
        System.out.println("Barking like a Dog!");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + food + " like a Dog!");
    }
}
