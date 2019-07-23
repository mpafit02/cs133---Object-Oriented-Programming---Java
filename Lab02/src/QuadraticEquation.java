/**
 * 
 * @author Marios
 * @version 1.0
 * @since 23/01/2018
 *
 *        We have three variables: a, b, c We have setters and getters for each
 *        variable We have one Constructor which set variable to a, b ,c The
 *        function Calculate() checks if the a is equal to 0 then the result is
 *        -b/c else calls the function Diakrinousa() The function Diakrinousa()
 *        calculates diakrinousa of the three numbers
 * 
 */
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	private static double Diakrinousa(double a, double b, double c) {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public void Calculate() {
		if (a == 0) {
			System.out.println("Solution: " + (-c / b));
		} else {
			double d = Diakrinousa(a, b, c);
			if (d < 0) {
				System.out.println("No real solutions");
			} else if (d == 0) {
				System.out.println("Solution: " + (-b + Math.sqrt(d)) / (2 * a));
			} else {
				System.out.println("Solution 1: " + (-b + Math.sqrt(d)) / (2 * a));
				System.out.println("Solution 2: " + (-b - Math.sqrt(d)) / (2 * a));
			}
		}
	}

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

}
