
public class LinearEquation {

	double a, b, c, d, e, f, x, y;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void setD(double d) {
		this.d = d;
	}

	public void setE(double e) {
		this.e = e;
	}

	public void setF(double f) {
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double gatB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double gatE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public void Solve() {
		if ((a * d - b * c) == 0) {
			System.out.println("Error! Divsion by zero.");
		} else {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}

}
