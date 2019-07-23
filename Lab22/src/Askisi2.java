import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.HashSet;

public class Askisi2 {

	public static void main(String[] args) {
		String filename = "C:\\Users\\mario\\eclipse-workspaceEPL133\\Lab22\\src\\list.txt";
		Scanner scan;
		// String arr[];
		HashSet<String> set = new HashSet<String>();
		String name;
		try {
			scan = new Scanner(new FileReader(filename));
			while (scan.hasNextLine()) {
				name = scan.nextLine();
				set.add(name);

				/*
				 * if(!set.contains(name){ set.add(name); }
				 */
			}
			for (Object obj : set.toArray()) {
				name = (String)obj;
				System.out.println(name);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

		
		/*
		 * arr = new String[set.size()]; set.toArray(arr); for (int i = 0; i <
		 * arr.length; i++) { System.out.println(arr[i]); }
		 */

	}

}
