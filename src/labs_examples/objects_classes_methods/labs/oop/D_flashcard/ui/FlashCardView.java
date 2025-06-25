package labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui;

public class FlashCardView {

    private UserIO io = new IUserIOConsole();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Cards");
        io.print("2. Add New Card");
        io.print("3. Remove Card");
        io.print("4. Exit");

        return io.readInt("Please enter a selection", 1, 4);
    }
}
