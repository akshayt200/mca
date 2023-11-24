import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23_WordSearchInFile {
    public static void main(String[] args) {
        String filePath = ("C:/Users/aksha/OneDrive/Desktop/MCA/Java/Sample.txt"); // Replace with your file path
        String wordToSearch = "example"; // Replace with the word you want to search

        int occurrences = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath)) ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals(wordToSearch)) {
                        occurrences++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        System.out.println("The word '" + wordToSearch + "' occurs " + occurrences + " times in the file.");
    }
}
