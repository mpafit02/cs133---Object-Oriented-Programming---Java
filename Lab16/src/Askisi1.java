import java.util.Scanner;
import java.io.*;

public class Askisi1 {
	public static void main(String[] args) throws IOException {
		String inFileName, outFileName;
		Scanner stdin = new Scanner(System.in);
		FileInputStream inputStream;
		PrintWriter outputStream;
		System.out.print("Input File Name: ");
		inFileName = stdin.nextLine();
		System.out.print("Output File Name: ");
		outFileName = stdin.nextLine();
		try {
			inputStream = new FileInputStream(inFileName);
			outputStream = new PrintWriter(new FileOutputStream(outFileName));
			int c;
			while ((c = inputStream.read()) >= 0) {
				outputStream.write(c);
			}
			System.out.println("Congratulations you have read the file!");
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		stdin.close();
	}
}
