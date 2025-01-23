import java.io.RandomAccessFile;
import java.io.IOException;

public class FileRandomRead {
    public static void main(String[] args) {
        try (RandomAccessFile fileReader = new RandomAccessFile("random_file.txt", "r")) {
            fileReader.seek(0); // Move to the beginning
            String line = fileReader.readLine();
            System.out.println("Read from the beginning: " + line);
            fileReader.seek(10); // Move to a specific byte position
            line = fileReader.readLine();
            System.out.println("Read from byte position 10: " + line);
        } catch (IOException ex) {
            System.out.println("Error during random file reading: " + ex.getMessage());
        }
    }
}
