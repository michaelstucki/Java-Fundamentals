package labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui;

import labs_examples.objects_classes_methods.labs.oop.D_flashcard.dto.Card;
import java.util.List;

public class FlashCardView {

    private final UserIO io = new IUserIOConsole();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Cards");
        io.print("2. Add New Card");
        io.print("3. Remove Card");
        io.print("4. Exit");

        return io.readInt("Please enter a selection", 1, 4);
    }

    public Card getNewCard() {
        Card card = new Card();
        card.setFront(io.readString("Please enter the card's front (question or prompt)"));
        card.setBack(io.readString("Please enter the card's back (answer or response"));
        return card;
    }

    public void displayAddCardBanner() {
        io.print("=== Add Card ===");
    }

    public void displayAddCardSuccessBanner() {
        io.readString("Card successfully created. Please hit enter to continue");
    }

    public void displayCards(List<Card> cards) {
        for (Card card : cards) {
            String cardInfo = String.format("#%d Q: %s A: %s",
                    card.getId(),
                    card.getFront(),
                    card.getBack());
            io.print(cardInfo);
        }
        io.print("Please hit enter to continue");
    }

    public void displayAllCardsBanner() {
        io.print("=== Display All Cards ===");
    }
 }
