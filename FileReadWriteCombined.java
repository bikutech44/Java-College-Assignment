import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileReadWriteCombined {
    public static void main(String[] args) {
        // Writing data sequentially to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("combined_output.txt"))) {
            writer.write("This is a combined sequential read and write example.\n");
            writer.write("The second line is written here.");
        } catch (IOException ex) {
            System.out.println("Error during writing: " + ex.getMessage());
        }

        // Reading data sequentially from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("combined_output.txt"))) {
            String content;
            while ((content = reader.readLine()) != null) {
                System.out.println("Content from file: " + content);
            }
        } catch (IOException ex) {
            System.out.println("Error during reading: " + ex.getMessage());
        }
    }
}
