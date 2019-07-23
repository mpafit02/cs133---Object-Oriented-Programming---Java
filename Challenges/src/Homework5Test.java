import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Homework5Test {

	public static ArrayList<ArrayList<String>> getSentenceLists(String filename) {
		Scanner scan;
		String[] text;
		ArrayList<String> list;
		String sentence;
		ArrayList<ArrayList<String>> sentences = new ArrayList<>(10000);
		try {
			scan = new Scanner(new File(filename));
			scan.useDelimiter("[.?!]+");
			while (scan.hasNext()) {
				sentence = scan.next();
				list = new ArrayList<String>();
				text = sentence.split("[\\W]+");
				for (int i = 0; i < text.length; i++) {
					if (!text[i].equals("")) {
						list.add(text[i].toLowerCase());
					}
				}
				if (!list.isEmpty()) {
					sentences.add(list);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} // printAvailableSentenceList(sentences);
		return sentences;

	}

	public static void printAvailableSentenceList(ArrayList<ArrayList<String>> book) {
		System.out.print("[");
		for (int i = 0; i < book.size(); i++) {
			System.out.print("[");
			for (int j = 0; j < book.get(i).size(); j++) {
				System.out.print("\'" + book.get(i).get(j) + "\'");
				if (j != book.get(i).size() - 1) {
					System.out.print(", ");
				} else {
					System.out.print("]");
				}
			}
			if (i != book.size() - 1) {
				System.out.println(", ");
			} else {
				System.out.println("]");
			}
		}
	}

	public static void main(String[] args) {
		String filename = args[0];
		printAvailableSentenceList(getSentenceLists(filename));
	}

}
