
public class Triangle extends GeometricObject {
	private double side1, side2, side3;

	// Getters
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Constructors
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(double x1, double x2, double x3) {
		side1 = x1;
		side2 = x2;
		side3 = x3;
	}

	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3;
	}
}
