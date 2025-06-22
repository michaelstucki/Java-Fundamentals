package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

import java.util.ArrayList;
import java.util.Scanner;

public class LaundryController {
    private final Scanner scan;
    private LaundryOps ops;
    private final ArrayList<String> clothes;

    public LaundryController(Scanner scan, LaundryOps ops) {
        this.scan = scan;
        this.ops = ops;
        this.clothes = new ArrayList<>();
    }

    public void setOps(LaundryOps ops) {
        this.ops = ops;
    }

    public void doLaundry() {
        getClothes();
        ops.processClothes(clothes);
    }

    public void getClothes() {
        boolean moreClothes = true;
        do {
            System.out.print("More clothes to wash? Enter y or n: ");
            String choice = scan.next();
            moreClothes = choice.equalsIgnoreCase("y");
            if (moreClothes) {
                System.out.print("Enter garment to wash: ");
                String garment = scan.next();
                clothes.add(garment);
            }
        } while (moreClothes);
    }
}
