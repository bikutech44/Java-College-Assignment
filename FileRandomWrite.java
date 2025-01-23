import java.io.RandomAccessFile;
import java.io.IOException;

public class FileRandomWrite {
    public static void main(String[] args) {
        try (RandomAccessFile randomFile = new RandomAccessFile("random_file.txt", "rw")) {
            randomFile.writeBytes("First data written.\n");
            randomFile.seek(0); // Move the pointer to the beginning
            randomFile.writeBytes("Data overwriting the start position.\n");
            System.out.println("Random write operation finished.");
        } catch (IOException ex) {
            System.out.println("Error during random file writing: " + ex.getMessage());
        }
    }
}
