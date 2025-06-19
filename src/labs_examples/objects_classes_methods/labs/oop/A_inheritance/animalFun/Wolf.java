package labs_examples.objects_classes_methods.labs.oop.A_inheritance.animalFun;

public class Wolf extends Canine {
    public Wolf(String food) {
        this.food = food;
    }

    @Override
    public void makeNoise() {
        System.out.println("Howling like a Wolf!");
    }

    @Override
    public void eat() {
        System.out.println("Eating " + food + " like a Wolf!");
    }
}
