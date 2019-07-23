import java.util.Scanner;

class ExceptionNegativeValue extends Exception {
	double value;

	public ExceptionNegativeValue(double value) {
		this.value = value;
	}

	public String toString() {
		return "Negative Value Exception : " + value;
	}

	public String getMessage() {
		return this.toString();
	}
}

class SquareRoot {

	private double precision;
	private double num;

	public double getNum() {
		return num;
	}

	public SquareRoot(double num, double precision) {
		this.num = num;
		this.precision = precision;
	}

	public double squareRoot(double num) throws ExceptionNegativeValue {
		double solution, carry, a, b;

		if (num < 0)
			throw new ExceptionNegativeValue(num);
		a = 0;
		b = num;
		solution = (a + b) / 2;
		while ((b - a) > precision) {
			carry = solution * solution;
			if (carry > num)
				b = solution;
			else
				a = solution;
			solution = (a + b) / 2;
		}
		return solution;
	}

}

public class TestSquareRoot {
	public static void main(String[] args) {
		double num, precision;
		Scanner scan = new Scanner(System.in);
		System.out.print("Give a number: ");
		num = scan.nextDouble();
		System.out.print("Give the precision: ");
		precision = scan.nextDouble();
		SquareRoot sqrt = new SquareRoot(num, precision);
		try {
			System.out.println("The square root is: " + sqrt.squareRoot(num));
			System.out.println("The error is: " + sqrt.squareRoot(num) % 1);
		} catch (ExceptionNegativeValue e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		scan.close();
	}
}
