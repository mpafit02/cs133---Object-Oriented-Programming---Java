import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double a, b, c, d, e, f;
		a = stdin.nextDouble();
		b = stdin.nextDouble();
		c = stdin.nextDouble();
		d = stdin.nextDouble();
		e = stdin.nextDouble();
		f = stdin.nextDouble();
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		le.Solve();
		stdin.close();
	}

}
