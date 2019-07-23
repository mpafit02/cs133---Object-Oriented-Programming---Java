import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Askisi5 {

	public static void main(String[] args) {
		String filename = "C:\\Users\\mario\\eclipse-workspaceEPL133\\Lab22\\src\\list.txt";
		Scanner scan;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String line;
		try {
			scan = new Scanner(new FileReader(filename));
			while (scan.hasNext()) {
				line = scan.next();
				if (!map.containsKey(line)) {
					map.put(line, 1);
				} else {
					map.put(line, map.get(line) + 1);
				}
			}
			for (String key : map.keySet()) {
				System.out.println(map.get(key) + " times: " + key);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}

}
