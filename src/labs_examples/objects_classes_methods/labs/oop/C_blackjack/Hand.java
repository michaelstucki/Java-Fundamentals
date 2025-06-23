package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int handValue;

    public Hand() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() { return cards; }

    public void addCard(Card card) {
        cards.add(card);
    }

    private void setHandValue() {
        int value = 0;
        for(Card card : cards) value += card.getValue();
        handValue = value;
    }

    public int getHandValue() { return handValue; }

    public boolean isGreaterThan21() {
        return handValue > 21;
    }
}
