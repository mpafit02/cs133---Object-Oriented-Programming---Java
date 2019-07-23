import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String args[]) {
		int key;
		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		key = scan.nextInt();
		while (key >= 0) {
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
			key = scan.nextInt();
		}

		for (Integer k : map.keySet()) {
			System.out.println("The number " + k + " occurs " + map.get(k) + " times.");
		}
		scan.close();
	}
}
