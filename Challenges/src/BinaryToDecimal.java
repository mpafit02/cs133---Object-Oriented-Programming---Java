import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String str;
		int sum = 0;
		Scanner stdin = new Scanner(System.in);
		str = stdin.next();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				sum += Math.pow(2, str.length() - 1 - i);
			}
		}
		System.out.println(sum);
		stdin.close();

	}
}
