package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int potValue; // the amount of money they have

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() { return name; }
    public Hand getHand() { return hand; }

    public boolean computerAI() {
        return hand.getHandValue() < 16;
    }
}
