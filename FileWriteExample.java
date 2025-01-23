import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter("output_file.txt"))) {
            outputWriter.write("Writing data to a file sequentially.\n");
            outputWriter.write("This is the second line written.");
            System.out.println("Sequential file write completed.");
        } catch (IOException ex) {
            System.out.println("Error during file writing: " + ex.getMessage());
        }
    }
}
