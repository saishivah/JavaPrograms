import java.io.*;

public class CustomPrintExample {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream for the desired output file
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            // Create a PrintStream with the FileOutputStream as the output stream
            PrintStream customPrintStream = new PrintStream(fileOutputStream);

            // Use the customPrintStream to call println
            customPrintStream.println("Hello, custom PrintStream!");

            // Remember to close the customPrintStream and the FileOutputStream when done
            customPrintStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
