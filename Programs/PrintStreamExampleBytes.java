import java.io.*;
public class PrintStreamExampleBytes {

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        ps.println("Hello, World!");
        ps.println("This is a custom PrintStream example.");

        ps.flush();
//does not print anything in this case
//        String output = baos.toString();
//        System.out.println(output);

        ps.close();
    }
}