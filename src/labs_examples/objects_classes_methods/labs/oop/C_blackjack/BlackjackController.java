package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Locale;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] cards = deck.getCards();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scan.next();
        Player user = new Player(userInput);
        Player ai = new Player("computer");

        deck.deal(user);
        deck.deal(user);
        deck.deal(ai);
        deck.deal(ai);

        boolean gameOver = false;
        do {
            // User's play
            System.out.println("-------------- " + user.getName().toUpperCase() + " --------------");
            System.out.println(user.getHand().cardsToString() + " " + user.getHand().getHandValue());
            System.out.print("Enter H[it] or S[tick]: ");
            userInput = scan.next();
            if (userInput.equalsIgnoreCase("h")) {
                deck.deal(user);
                System.out.println(user.getHand().cardsToString() + " " + user.getHand().getHandValue());
            }

            // Computer's play
            System.out.println("-------------- " + ai.getName().toUpperCase() + " --------------");
            System.out.println(ai.getHand().cardsToString() + " " + ai.getHand().getHandValue());
            System.out.print("Enter H[it] or S[tick]: ");
            String aiInput = ai.computerAI() ? "h" : "s";
            if (aiInput.equalsIgnoreCase("h")) {
                System.out.print("h\n");
                deck.deal(ai);
                System.out.println(ai.getHand().cardsToString() + " " + ai.getHand().getHandValue());
            } else {
                System.out.print("s\n");
            }

            // See if game is over
            if (user.getHand().isBusted() || ai.getHand().isBusted()) {
                gameOver = true;
            } else if (userInput.equalsIgnoreCase("s") && aiInput.equalsIgnoreCase("s")) {
                gameOver = true;
            }
        } while(!gameOver);

        // Determine the winner
        String winner;
        if (user.getHand().isBusted() && ai.getHand().isBusted()) winner = "None";
        else if (user.getHand().isBusted()) winner = ai.getName();
        else if (ai.getHand().isBusted()) winner = user.getName();
        else {
            if (21 - user.getHand().getHandValue() < 21 - ai.getHand().getHandValue()) winner = user.getName();
            else winner = ai.getName();
        }

        System.out.println("-------------- GAME OVER! --------------");
        System.out.println("Winner is " + winner + "!");
    }
}
