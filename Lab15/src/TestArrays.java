import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		int[] table = { 3, 4, 2, 6, 7, 1, 5, 8, 3, 1, 5, 7 };
		try {
			Arrays.sort(table);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
	}

}
