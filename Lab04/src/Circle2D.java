
public class Circle2D {

	private double x;
	private double y;
	private double radius;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	private double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}

	public boolean contains(double x, double y) {
		return distance(x, y) <= radius;
	}

	public boolean contains(Circle2D circle) {
		return Math.abs(radius - circle.getRadius()) <= distance(circle.getX(), circle.getY());
	}

	public boolean overlaps(Circle2D circle) {
		return distance(circle.getX(), circle.getY()) <= radius + circle.getRadius();
	}
}
