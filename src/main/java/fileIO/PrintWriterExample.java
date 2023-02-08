package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PrintWriterExample {

    /** Write "hello" to the given file.
     * @param filename name of the output file
     */
    public static void writeToFile(String filename) {
        try (PrintWriter printWriter = new PrintWriter (filename)) {
            printWriter.println ("hello");

        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file.");
        }
    }

    public static void main(String[] args) {
        writeToFile("newFile.txt");
    }
}
