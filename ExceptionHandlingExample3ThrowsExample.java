import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample3ThrowsExample {
    public static void main(String[] args) {
        try {
            System.out.println(readFirstLine("example.txt")); // File might not exist
        } catch (IOException ex) {
            System.out.println("IOException caught: " + ex.getMessage());
        }
    }
    public static String readFirstLine(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        reader.close();
        return line;
    }
}
