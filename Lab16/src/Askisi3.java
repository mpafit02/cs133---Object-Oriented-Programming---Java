import java.io.*;
import java.util.*;

public class Askisi3 {

	public static void main(String[] args) {
		String FileName = "ArrayFile.txt";
		Scanner inputStream;
		PrintWriter outputStream;
		try {
			outputStream = new PrintWriter(new FileOutputStream(FileName));
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					outputStream.write(i +" ");
				}
				outputStream.write("\r\n");
			}
			outputStream.close(); //Prepei na klisei gia na dievastei ksana
			inputStream = new Scanner(new FileInputStream(FileName));
			while (inputStream.hasNextLine()) {
				System.out.println(inputStream.nextLine());
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}

}
