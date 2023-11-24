

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q24_FileStatsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)) {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                // Count characters and lines
                charCount += line.length();
                lineCount++;

                // Split the line into words using whitespace as a delimiter and count words
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Character count: " + charCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error reading the file.");
        }
    }
}
