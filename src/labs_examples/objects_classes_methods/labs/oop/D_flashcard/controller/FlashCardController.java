package labs_examples.objects_classes_methods.labs.oop.D_flashcard.controller;

import labs_examples.objects_classes_methods.labs.oop.D_flashcard.dao.FlashCardDao;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.dao.IFlashCardDaoFile;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.dto.Card;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.FlashCardView;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.IUserIOConsole;
import labs_examples.objects_classes_methods.labs.oop.D_flashcard.ui.UserIO;
import java.util.List;

public class FlashCardController {
    private FlashCardView view = new FlashCardView();
    private FlashCardDao dao = new IFlashCardDaoFile();
    private UserIO io = new IUserIOConsole();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while(keepGoing) {
            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listCards();
                    break;
                case 2:
                    addCard();
                    break;
                case 3:
                    displayCard();
                    break;
                case 4:
                    removeCard();
                    break;
                case 5:
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

    private void listCards() {
        view.displayAllCardsBanner();
        List<Card> cards = dao.getAllCards();
        view.displayAllCards(cards);
    }

    private void addCard() {
        view.displayAddCardBanner();
        Card card = view.getNewCard();
        dao.addCard(card.getId(), card);
        view.displayAddCardSuccessBanner();
    }

    private void displayCard() {
        view.displayViewCardBanner();
        int id = view.getCardIdChoice();
        Card card = dao.viewCard(id);
        view.displayCard(card);
    }

    private void removeCard() {
        view.displayRemoveCardBanner();
        int id = view.getCardIdChoice();
        Card card = dao.removeCard(id);
        view.removeCard(card);
    }
}
