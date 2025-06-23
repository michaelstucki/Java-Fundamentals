package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private final String rankSuit;
    private final int value;

    public Card(String rankSuit, int value) {
        this.rankSuit = rankSuit;
        this.value = value;
    }

    public String getRankSuit() {
        return rankSuit;
    }

    public int getValue() {
        return value;
    }
}
