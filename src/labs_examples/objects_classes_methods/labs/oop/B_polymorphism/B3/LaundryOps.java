package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

import java.util.ArrayList;

public interface LaundryOps {
    public void processClothes(ArrayList<String> clothes);
    public void sort();
    public void wash();
    public void dry();
    public void fold();
    public void returnClothes();
}
