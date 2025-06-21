package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B2;

import java.util.Random;

public class RandomMove {
    private static final Random random = new Random(System.currentTimeMillis());
    public static int getRandomIndex(int maximum) {
        return random.nextInt(maximum);
    }
}
