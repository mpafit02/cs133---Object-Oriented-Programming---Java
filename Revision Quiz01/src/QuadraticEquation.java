
public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	private double x, y;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String toString() {
		return a + "x^2 " + b + "x " + c + "\n";
	}

	public String solve() {
		if (a == 0) {
			x = -b / c;
			return "Solution 1: " + x + "\n";
		} else {
			x = (-b + Math.sqrt((b * b - 4 * a * c) / 2)) / (2 * a);
			y = (-b - Math.sqrt((b * b - 4 * a * c) / 2)) / (2 * a);
			return "Solution 1: " + x + "\n" + "Solution 2: " + y + "\n";
		}

	}
}
