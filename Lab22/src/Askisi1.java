import java.util.HashMap;
import java.util.Scanner;

public class Askisi1 {

	private static Scanner scan;

	public static void printHashMap(HashMap<Integer, Integer> map) {
		for (Integer key: map.keySet()) {
			System.out.println("The number " + key + " occurs " + map.get(key) + " times.");
		}
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		scan = new Scanner(System.in);

		int key = 0;

		while (key >= 0) {
			key = scan.nextInt();
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}
		printHashMap(map);
	}

}
