import java.io.*;
import java.util.Scanner;

public class Askisi4 {

	public static void main(String[] args) throws IOException {
		String inFileName, outFileName;
		Scanner stdin = new Scanner(System.in);
		InputStream is;
		Reader r;
		LineNumberReader inputStream;
		PrintWriter outputStream;

		inFileName = "FileNameTest.txt";
		outFileName = "FileNameOutputAskisi4.txt";
		try {
			is = new FileInputStream(inFileName);
			r = new InputStreamReader(is);
			inputStream = new LineNumberReader(r);
			outputStream = new PrintWriter(new FileOutputStream(outFileName));
			String line;
			while ((line = inputStream.readLine()) != null) {
				int length = line.length();
				for (int i = line.length() - 1; i >= 0; i--) {
					if (!Character.isWhitespace(line.charAt(i))) {
						length = i;
						break;
					}
				}
				String input = line.substring(0, length + 1);
				System.out.println(input);
				outputStream.write(input);
				outputStream.write("\r\n");
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
