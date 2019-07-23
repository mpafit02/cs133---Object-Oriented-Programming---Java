
public class Circle2D {

	private double radius, x, y;

	// Getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	// Constructors
	public Circle2D() {
		radius = 1;
		x = 0;
		y = 0;
	}

	public Circle2D(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	// Area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	// Primeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	// Distance
	private double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}

	// Contains Point
	public boolean contains(double x, double y) {
		return distance(x, y) <= radius;
	}

	// Contains Circle
	public boolean contains(Circle2D circle) {
		return distance(circle.getX(), circle.getY()) <= radius - circle.getRadius();
	}
}
