package painting.shapes;

public class Cylinder extends Shape {
	private double radius;
	private double height;

	public Cylinder(String shapeName) {
		super(shapeName);
	}

	public Cylinder(double radius, double height) {
		this("Cylinder");
		this.radius = radius;
		this.height = height;
	}

	@Override
	protected double area() {
		return Math.PI * radius * radius * height;
	}

	public String toString() {
		return super.toString() + "\t with radius = " + radius + " and height = " + height;
	}

}
