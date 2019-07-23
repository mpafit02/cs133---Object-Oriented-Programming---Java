
public class RationalNumbers {
	int a;
	int b;

	public RationalNumbers() {
		a = 0;
		b = 1;
	}

	public RationalNumbers(int a, int b) {
		if (b == 0) {
			System.out.println("Error!");
		} else {
			this.a = a;
			this.b = b;
			simplify(a, b);
		}
	}

	private void simplify(int a, int b) {
		int i = 2;
		int mkd = 1;
		int min = a;
		if (b < a) {
			min = b;
		}
		while (i <= min) {
			if ((a % i == 0) && (b % i == 0)) {
				mkd = i;
			}
			i++;
		}
		this.a = a / mkd;
		this.b = b / mkd;
	}

	public double getValue() {
		return (double)a / (double)b;
	}

	public RationalNumbers add(RationalNumbers rm1) {
		RationalNumbers rm = new RationalNumbers(this.a * rm1.b + this.b * rm1.a, this.b * rm1.b);
		rm.simplify(rm.a, rm.b);
		return rm;
	}

	public RationalNumbers substract(RationalNumbers rm1) {
		RationalNumbers rm = new RationalNumbers(this.b * rm1.a - this.a * rm1.b, this.b * rm1.b);
		rm.simplify(rm.a, rm.b);
		return rm;
	}

	public RationalNumbers multiply(RationalNumbers rm1) {
		RationalNumbers rm = new RationalNumbers( rm1.b * this.b, rm1.a * this.a);
		rm.simplify(rm.a, rm.b);
		return rm;
	}

	public RationalNumbers divide(RationalNumbers rm1) {
		RationalNumbers rm = new RationalNumbers(rm1.b * this.a, rm1.a * this.b);
		rm.simplify(rm.a, rm.b);
		return rm;
	}

	public String toString() {
		String str = a + " / " + b;
		return str;
	}
}
