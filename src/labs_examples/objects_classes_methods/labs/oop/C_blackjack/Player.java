package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int potValue; // the amount of money they have

    public Player(String name, int potValue) {
        this.name = name;
        this.hand = new Hand();
        this.potValue = potValue;
    }

    public String getName() { return name; }
    public Hand getHand() { return hand; }
    public int getPotValue() { return potValue; }
    public void setPotValue(int betValue, char operation) {
        switch (operation) {
            case '+':
                potValue += betValue;
                break;
            case '-':
                potValue -= betValue;
                break;
            default:
        }
    }

    public boolean computerAI() {
        return hand.getHandValue() < 16;
    }
}
