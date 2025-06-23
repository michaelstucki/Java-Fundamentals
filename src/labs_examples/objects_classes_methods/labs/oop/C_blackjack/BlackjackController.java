package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] cards = deck.getCards();
        for(Card card : cards) {
            System.out.println(card.getRankSuit() + " " + card.getValue());
        }
    }
}
