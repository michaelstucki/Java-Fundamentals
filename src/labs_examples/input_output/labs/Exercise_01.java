package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        String fileInPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileOutPath = "src/labs_examples/input_output/files/exercise01.txt";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileInPath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileOutPath))) {
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            while ((bytesRead = bis.read(buffer)) != -1) bos.write(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}