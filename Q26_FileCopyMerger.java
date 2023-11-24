
import java.io.*;

public class Q26_FileCopyMerger {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the first file name: ");
            String inputFile1 = reader.readLine();
            System.out.print("Enter the second file name: ");
            String inputFile2 = reader.readLine();
            System.out.print("Enter the output file name: ");
            String outputFile = reader.readLine();

            copyAndMergeFiles(inputFile1, inputFile2, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while reading file names.");
        }
    }

    public static void copyAndMergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
             BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files copied and merged successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while copying and merging files.");
        }
    }
}
