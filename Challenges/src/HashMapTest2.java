import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		String name;
		while (scan.hasNextLine()) {
			name = scan.nextLine();
			set.add(name);
		}

		for (Object s : set.toArray()) {
			System.out.println((String) s);
		}

	}

}
