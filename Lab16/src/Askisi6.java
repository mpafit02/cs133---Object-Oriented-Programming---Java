import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Askisi6 {

	public static void main(String[] args) {
		String FileName = "numbersBinFile.bin";
		try {
			ObjectInputStream inputStreamName = new ObjectInputStream(new FileInputStream(FileName));
			PrintWriter outputStreamName = new PrintWriter(new FileOutputStream("numbersTxtFile.txt"));
			String content = inputStreamName.readUTF();
			String input;
			outputStreamName.write(content + "\r\n");
			for (int i = 0; i < content.length(); i++) {
				if (content.charAt(i) == 'i') {
					input = inputStreamName.readInt() + "\r\n";
					outputStreamName.write(input);
				} else {
					input = inputStreamName.readDouble() + "\r\n";
					outputStreamName.write(input);
				}
			}
			System.out.println("Congratulations!");
			inputStreamName.close();
			outputStreamName.close();
		} catch (IOException e) {
			e.getMessage();
		}

	}

}
