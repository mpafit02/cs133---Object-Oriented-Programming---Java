import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeSet;
import java.util.Scanner;

public class Askisi6 {

	public static void main(String[] args) {
		String filename = "C:\\Users\\mario\\eclipse-workspaceEPL133\\Lab22\\src\\list.txt";
		Scanner scan;
		// String arr[];
		TreeSet<String> set = new TreeSet<String>();
		String name;
		try {
			scan = new Scanner(new FileReader(filename));
			while (scan.hasNextLine()) {
				name = scan.nextLine();
				set.add(name);
			}
			for (Object obj : set.toArray()) {
				name = (String) obj;
				System.out.println(name);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}
}
