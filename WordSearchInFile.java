import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearchInFile {
    public static void main(String[] args) {
        try {
            String fileName = "sample.txt";
            String wordToSearch = "word_to_search";

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToSearch)) {
                    found = true;
                    break;
                }
            }

            reader.close();

            if (found) {
                System.out.println("The word '" + wordToSearch + "' was found in the file.");
            } else {
                System.out.println("The word '" + wordToSearch + "' was not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
