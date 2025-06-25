package labs_examples.objects_classes_methods.labs.oop.D_flashcard.controller;

import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.IUserIOConsole;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.UserIO;

public class FlashCardController {
    private UserIO io = new IUserIOConsole();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while(keepGoing) {
            io.print("Main Menu");
            io.print("1. List Cards");
            io.print("2. Add New Card");
            io.print("3. Remove Card");
            io.print("4. Exit");

            menuSelection = io.readInt("Please enter a selection", 1, 4);

            switch (menuSelection) {
                case 1:
                    io.print("LIST CARDS");
                    break;
                case 2:
                    io.print("ADD NEW CARD");
                    break;
                case 3:
                    io.print("REMOVE CARD");
                    break;
                case 4:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN SELECTION!");
            }
        }
        io.print("GOOD BYE!");
        io.close();
    }
}
