import java.util.HashMap;

public class Askisi3 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put(i, i);
		}
		for(Integer key: map.keySet()) {
			System.out.println("<" + key + " ," + map.get(key)+" >");
		}
	}

}
