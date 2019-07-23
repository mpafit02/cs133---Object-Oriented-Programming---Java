import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double a;
		double b;
		double c;
		a = stdin.nextDouble();
		b = stdin.nextDouble();
		c = stdin.nextDouble();
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		qe.Calculate();
		stdin.close();
	}

}
