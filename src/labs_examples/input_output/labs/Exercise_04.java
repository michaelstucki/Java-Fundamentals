package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Exercise_04 {
    private static final String DELIMITER = ",";
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        String record;
        String filePath = "src/labs_examples/input_output/files/flashcards.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while((record = br.readLine()) != null) {
                cards.add(unmarshallCard(record));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Card card : cards) System.out.println(card.toString());

        filePath = "src/labs_examples/input_output/files/flashcards_new.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Card card : cards) {
                String cardAsText = marshallCard(card);
                bw.write(cardAsText);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // String to Card
    public static Card unmarshallCard(String cardAsText) {
        String[] tokens = cardAsText.split(DELIMITER);
        String front = tokens[0];
        String back = tokens[1];
        return new Card(front, back);
    }

    // Card to String
    public static String marshallCard(Card card) {
        StringBuilder sb = new StringBuilder();
        sb.append(card.getFront()).append(DELIMITER).append(card.getBack());
        return sb.toString();
    }
}


