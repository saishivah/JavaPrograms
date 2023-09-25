import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Create a File object
        java.io.File file = new java.io.File("t.txt");

        try {
            // Read characters from the file using FileReader
            FileReader fileReader = new FileReader(file);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        }
    }
}
