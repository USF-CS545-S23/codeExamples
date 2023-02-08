package fileIO;

import java.io.*;

public class BufferedReaderExample {
    public static void readFromFile(String filename) {
        try (FileReader f = new FileReader(filename);
             BufferedReader br = new BufferedReader(f)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("No file found");
        }
    }
    public static void main(String[] args) {
       readFromFile("file1.txt");
    }
}
