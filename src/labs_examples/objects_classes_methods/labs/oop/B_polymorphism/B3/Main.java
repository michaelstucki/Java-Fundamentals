package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LaundryController laundryController;
        ArrayList<String> clothes = getClothes(scan);

        if (!clothes.isEmpty()) {
            System.out.print("Enter 0 for Cleaners or 1 for By Hand at Home: ");
            String choice = scan.next();
            switch(choice) {
                case "0":
                    laundryController = new LaundryController(new Cleaners(clothes));
                    break;
                case "1":
                    laundryController = new LaundryController(new Hands(clothes));
                    break;
                default:
                    System.out.println("Invalid selection!");
                    laundryController = null;
            }
            if (laundryController != null) laundryController.doLaundry();
        }
        System.out.println("Bye!");
        scan.close();
    }

    public static ArrayList<String> getClothes(Scanner scan) {
        ArrayList<String> clothes = new ArrayList<>();
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
        return clothes;
    }
}
