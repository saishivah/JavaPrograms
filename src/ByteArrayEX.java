// java program to write data to file

import java.io.FileOutputStream;
import java.util.*;

public class ByteArrayEX {
	public static void main(String[] args)
	{
        
		String data = "Welcome to GfG";
        char ch[]= data.toCharArray();

		try {
			FileOutputStream output
				= new FileOutputStream("output1.txt");

			// The getBytes() method used
			// converts a string into bytes array.
			byte[] array = data.getBytes();

			// writing the string to the file by writing
			// each character one by one
			// Writes byte to the file
			output.write(array);
            output.write(ch[0]);

			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
