//Build a Java program that reads data from a .txt file, processes it (e.g., modifies or formats), and writes the result to a new text file.
import java.io.*;
public class TextFileReaderWriter {
    public static void main(String[] args) {
        String inputPath = "input.txt";
        String outputPath = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                //  Converting into uppercase before writing
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Data processed and written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
