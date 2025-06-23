package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private final Card[] cards;
    private final Random random;
    private final ArrayList<Integer> unUsedCards;

    public Deck() {
        final String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        final String[] suits = new String[]{"♠", "♦", "♥", "♣"};
        cards = new Card[ranks.length * suits.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                int value = 0;
                switch (rank) {
                    case "A":
                        value = 1;
                        break;
                    case "2", "3", "4", "5", "6", "7", "8", "9", "10":
                        value = Integer.parseInt(rank);
                        break;
                    case "J", "Q", "K":
                        value = 10;
                        break;
                    default:
                }
                cards[index] = new Card(rank + suit, value);
                index++;
            }
        }
        random = new Random(System.currentTimeMillis());
        unUsedCards = new ArrayList<>();
        for(int i = 0; i < cards.length; i++) unUsedCards.add(i);
    }

    public void deal(Player player) {
        int index = random.nextInt(unUsedCards.size());
        Card card = cards[index];
        player.getHand().addCard(card);
        unUsedCards.remove(index);
    }
}
