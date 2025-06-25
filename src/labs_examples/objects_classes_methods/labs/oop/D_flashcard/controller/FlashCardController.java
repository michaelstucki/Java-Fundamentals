package labs_examples.objects_classes_methods.labs.oop.D_flashcard.controller;

import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.FlashCardView;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.IUserIOConsole;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.UserIO;

public class FlashCardController {
    private FlashCardView view = new FlashCardView();
    private UserIO io = new IUserIOConsole();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while(keepGoing) {
            menuSelection = getMenuSelection();

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

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
}
