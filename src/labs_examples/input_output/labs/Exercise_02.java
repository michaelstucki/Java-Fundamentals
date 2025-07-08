package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        String fileInPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileOutPath = "src/labs_examples/input_output/files/exercise02.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileInPath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutPath))) {
            int i;
            while((i = br.read()) != -1) {
                if (i == 'e') i = '~';
                bw.write(i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        fileInPath = "src/labs_examples/input_output/files/exercise02.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileInPath))) {
            int i;
            while((i = br.read()) != -1) {
                if (i == '~') i = 'e';
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

