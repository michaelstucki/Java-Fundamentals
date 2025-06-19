package labs_examples.objects_classes_methods.labs.oop.A_inheritance.animalFun;

import java.util.ArrayList;

public class AnimalController {
    public static void main(String[] args) {
        Lion lion = new Lion("gazelle");
        Cat cat = new Cat("fish");
        Wolf wolf = new Wolf("rabbit");
        Dog dog = new Dog("bones");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(cat);
        animals.add(wolf);
        animals.add(dog);

        for(Animal animal : animals) {
            animal.sleep();
            animal.roam();
            animal.makeNoise();
            animal.eat();
            System.out.println("-------------");
        }
    }
}
