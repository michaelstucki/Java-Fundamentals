package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        String userInput, aiInput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userInput = scan.next();
        Player user = new Player(userInput, 100);
        Player ai = new Player("Computer", 100);

        // Game loop
        System.out.println("------------ Welcome to Blackjack! ------------");
        boolean gameOver = false;
        do {
            // Player pot amounts
            System.out.println("-------------- REMAINING POTS --------------");
            System.out.println(user.getName() + ": $" + user.getPotValue());
            System.out.println(ai.getName() + ": $" + ai.getPotValue());
            System.out.println();

            // Get bets
            System.out.print(user.getName() + " place your bet: ");
            userInput = scan.next();
            int userBet = Integer.parseInt(userInput);
            System.out.print(ai.getName() + " place your bet: ");
            aiInput = scan.next();
            int aiBet = Integer.parseInt(aiInput);

            // See if players are all-in
            if (userBet > user.getPotValue()) userBet = user.getPotValue();
            if (aiBet > ai.getPotValue()) aiBet = ai.getPotValue();

            System.out.println("-------------- USER BETS --------------");
            System.out.println(user.getName() + ": $" + userBet);
            System.out.println(ai.getName() + ": $" + aiBet);
            System.out.println();

            // Deal each player two (2) cards
            System.out.println("Dealing hands...");
            deck.deal(user);
            deck.deal(user);
            deck.deal(ai);
            deck.deal(ai);

            // Hand loop
            boolean handOver = false;
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
                aiInput = ai.computerAI() ? "h" : "s";
                if (aiInput.equalsIgnoreCase("h")) {
                    System.out.print("h\n");
                    deck.deal(ai);
                    System.out.println(ai.getHand().cardsToString() + " " + ai.getHand().getHandValue());
                } else {
                    System.out.print("s\n");
                }

                // See if game is over
                if (user.getHand().isBusted() || ai.getHand().isBusted()) {
                    handOver = true;
                } else if (userInput.equalsIgnoreCase("s") && aiInput.equalsIgnoreCase("s")) {
                    handOver = true;
                }
            } while(!handOver);

            // Determine the winner
            String winner;
            if (user.getHand().isBusted() && ai.getHand().isBusted()) winner = "None";
            else if (user.getHand().isBusted()) winner = ai.getName();
            else if (ai.getHand().isBusted()) winner = user.getName();
            else {
                if (21 - user.getHand().getHandValue() < 21 - ai.getHand().getHandValue()) winner = user.getName();
                else winner = ai.getName();
            }

            System.out.println("-------------- HAND OVER! --------------");
            System.out.println(winner + " won!");
            System.out.println();

            // Deal with bets
            if (winner.equalsIgnoreCase(user.getName())) {
                user.setPotValue(aiBet, '+');
                ai.setPotValue(aiBet, '-');
            } else if (winner.equalsIgnoreCase(ai.getName())) {
                user.setPotValue(userBet, '-');
                ai.setPotValue(userBet, '+');
            }

            if (user.getPotValue() <= 0) gameOver = true;
            else if (ai.getPotValue() <= 0) gameOver = true;

            // Collect cards from players
            user.getHand().clearHand();
            ai.getHand().clearHand();
        } while(!gameOver);

        System.out.println("-------------- GAME OVER! --------------");
        scan.close();

        // Player pot amounts
        System.out.println("-------------- END of GAME POTS --------------");
        System.out.println(user.getName() + ": $" + user.getPotValue());
        System.out.println(ai.getName() + ": $" + ai.getPotValue());
        System.out.println();
    }
}
