
public class RationalNumbers {
	private int a;
	private int b;

	// Getters
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	// Constructors
	public RationalNumbers() {
		a = 0;
		b = 1;
	}

	public RationalNumbers(RationalNumbers rn) {
		a = rn.getA();
		b = rn.getB();
	}

	public RationalNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		simplify();
	}

	private int GCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GCD(b, a % b);
		}
	}

	public void simplify() {
		int n = GCD(a, b);
		a = a / n;
		b = b / n;
	}

	public double getValue() {
		return (double) a / b;
	}

	public RationalNumbers add(RationalNumbers rn1) {
		RationalNumbers rn = new RationalNumbers(rn1.getA() * b + rn1.getB() * a, rn1.getB() * b);
		return rn;
	}

	public RationalNumbers subtract(RationalNumbers rn1) {
		RationalNumbers rn = new RationalNumbers(rn1.getA() * b - rn1.getB() * a, rn1.getB() * b);
		return rn;
	}

	public RationalNumbers multiply(RationalNumbers rn1) {
		RationalNumbers rn = new RationalNumbers(rn1.getA() * a, rn1.getB() * b);
		return rn;
	}

	public RationalNumbers divide(RationalNumbers rn1) {
		RationalNumbers rn = new RationalNumbers(rn1.getB() * a, rn1.getA() * b);
		return rn;
	}

	public String toString() {
		return a + "/" + b;
	}
}
