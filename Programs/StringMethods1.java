import java.io.PrintStream;
import java.util.*;


public class StringMethods {


    public static void main(String[] args) {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);

        for (String word : arrOfStr) {
            System.out.println(word);
        }



    }
}

