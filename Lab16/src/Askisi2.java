import java.io.*;
import java.util.Scanner;

public class Askisi2 {

	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(System.in);
		String fileName;
		System.out.print("File name: ");
		fileName = stdin.nextLine();
		try {
			FileInputStream is = new FileInputStream(fileName);
			Reader inputStream = new InputStreamReader(is);
			int c;
			while ((c = inputStream.read()) >= 0) {
				System.out.print(Character.toUpperCase((char) c));
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		stdin.close();
	}

}
