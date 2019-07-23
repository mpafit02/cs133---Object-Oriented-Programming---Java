import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

import java.io.FileInputStream;

public class PrintWriterTest implements Output {

	public static void main(String[] args) {
		String filename = "OutPut.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileOutputStream(filename));
			pw.println("Hello World !");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Scanner scan;
		try {
			scan = new Scanner(new FileInputStream(filename));
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		ObjectOutputStream oos;
		ObjectInputStream ois;
		String line;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeUTF("My name is 1234");
			oos.writeInt(31);
			oos.writeUTF("1234");
			oos.close();
			ois = new ObjectInputStream(new FileInputStream(filename));
			while ((line = (String) (ois.readUTF())) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
