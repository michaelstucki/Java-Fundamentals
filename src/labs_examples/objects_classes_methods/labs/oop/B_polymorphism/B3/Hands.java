package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

import java.util.ArrayList;
import java.util.Collections;

public class Hands implements LaundryOps {
    private ArrayList<String> clothes;

    @Override
    public void processClothes(ArrayList<String> clothes) {
        this.clothes = clothes;
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
        System.out.print(this.getClass().getSimpleName() + " has sorted these clothes by hand: " + listClothes());
        System.out.println();
    }

    @Override
    public void wash() {
        System.out.print(this.getClass().getSimpleName() + " is washing these clothes by hand in a washtub: " + listClothes());
        System.out.println();
    }

    @Override
    public void dry() {
        System.out.print(this.getClass().getSimpleName() + " is drying these clothes on a clothesline: " + listClothes());
        System.out.println();
    }

    @Override
    public void fold() {
        System.out.print(this.getClass().getSimpleName() + " is folding these clothes by hand: " + listClothes());
        System.out.println();
    }

    @Override
    public void returnClothes() {
        System.out.println(this.getClass().getSimpleName() + " is returning the clothes!");
    }
}