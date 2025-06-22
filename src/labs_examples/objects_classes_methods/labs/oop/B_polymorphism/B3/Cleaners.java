package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

import java.util.ArrayList;
import java.util.Collections;

public class Cleaners implements LaundryOps {
    private final ArrayList<String> clothes;

    public Cleaners(ArrayList<String> clothes) {
        this.clothes = clothes;
    }

    @Override
    public void processClothes() {
        if (!clothes.isEmpty()) {
            sort();
            wash();
            dry();
            fold();
            returnClothes();
        }
    }

    public String listClothes() {
        StringBuilder stb = new StringBuilder();
        for(String garment : clothes) {
            stb.append(garment).append(" ");
        }
        return stb.toString();
    }

    @Override
    public void sort() {
        Collections.sort(clothes);
        System.out.print(this.getClass().getSimpleName() + " has sorted these clothes in a machine: " + listClothes());
        System.out.println();
    }

    @Override
    public void wash() {
        System.out.print(this.getClass().getSimpleName() + " is washing these clothes in a machine: " + listClothes());
        System.out.println();
    }

    @Override
    public void dry() {
        System.out.print(this.getClass().getSimpleName() + " is drying these clothes in a machine: " + listClothes());
        System.out.println();
    }

    @Override
    public void fold() {
        System.out.print(this.getClass().getSimpleName() + " is folding these clothes in a machine: " + listClothes());
        System.out.println();
    }

    @Override
    public void returnClothes() {
        System.out.println(this.getClass().getSimpleName() + " is returning the clothes!");
    }
}