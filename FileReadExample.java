import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("output_file.txt"))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error during file reading: " + ex.getMessage());
        }
    }
}
