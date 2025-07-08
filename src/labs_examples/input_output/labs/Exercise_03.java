package labs_examples.input_output.labs;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and on one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {

        // #1 ObjectOutputStream byte stream
        String filePath = "src/labs_examples/input_output/files/exercise03_a.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject("Today");
            oos.writeObject(LocalDateTime.now());
            oos.writeObject(new Card("1 + 1", "2"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // #1 ObjectInputStream byte stream
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            String label = (String) ois.readObject();
            LocalDateTime dateTime = (LocalDateTime) ois.readObject();
            Card card = (Card) ois.readObject();
            System.out.println(label + ", " + dateTime + ", " + card.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // List of cards
        ArrayList<Card> cards = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            String front = Integer.toString(i) + " * 5";
            String back = Integer.toString(i * 5);
            Card card = new Card(front, back);
            cards.add(card);
        }

        // #3 ObjectOutputStream byte stream with buffer
        filePath = "src/labs_examples/input_output/files/exercise03_b.txt";
        try (ObjectOutputStream oobs = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)))) {
            for (Card card : cards) {
                oobs.writeObject(card);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // #3 ObjectInputStream byte stream with buffer
        try (ObjectInputStream iobs = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)))) {
            for (int i = 0; i < cards.size(); i++) {
                Card card = (Card) iobs.readObject();
                System.out.println(card.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // #2 LineNumberReader character stream
        filePath = "src/labs_examples/input_output/files/char_data.txt";
        try (LineNumberReader lnr = new LineNumberReader(new FileReader(filePath))) {
            String line;
            while ((line = lnr.readLine()) != null) {
                System.out.println("Line " + lnr.getLineNumber() + ": " + line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // #3 LineNumberReader character stream with buffer
        try (LineNumberReader blnr = new LineNumberReader(new BufferedReader(new FileReader(filePath)))) {
            String line;
            while ((line = blnr.readLine()) != null) {
                System.out.println("Line " + blnr.getLineNumber() + ": " + line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // #2 StringReader character stream
        String data = "The answer is blowin' in the wind.";
        try (StringReader sr = new StringReader(data)) {
            int character;
            while((character = sr.read()) != -1) {
                System.out.print((char) character +  " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // #4 DataOutputStream character stream
        filePath = "src/labs_examples/input_output/files/exercise03_c.txt";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(77);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
            dos.writeUTF("The answer, my friend...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // #4 DataInputStream character stream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int i = dis.readInt();
            double d = dis.readDouble();
            boolean b = dis.readBoolean();
            String s = dis.readUTF();

            System.out.println("int: " + i);
            System.out.println("double: " + d);
            System.out.println("boolean: " + b);
            System.out.println("String: " + s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Card implements Serializable {
    private String front;
    private String back;

    public Card(String front, String back) {
        this.front = front;
        this.back = back;
    }

    @Override
    public String toString() {
        return "Card{" +
               "front='" + front + '\'' +
               ", back='" + back + '\'' +
               '}';
    }
}
