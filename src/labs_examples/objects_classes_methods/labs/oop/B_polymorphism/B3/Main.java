package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LaundryController laundryController;

        System.out.print("Enter 0 for Cleaners or 1 for By Hand at Home: ");
        String choice = scan.next();
        switch(choice) {
            case "0":
                laundryController = new LaundryController(scan, new Cleaners());
                break;
            case "1":
                laundryController = new LaundryController(scan, new Hands());
                break;
            default:
                System.out.println("Invalid selection!");
                laundryController = null;
        }

        if (laundryController != null) laundryController.doLaundry();
        scan.close();
    }
}
