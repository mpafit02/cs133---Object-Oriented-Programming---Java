package painting.shapes;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(String shapeName) {
		super(shapeName);
	}

	public Rectangle(double h, double w) {
		this("Rectangle");
		width = w;
		height = h;
	}

	@Override
	protected double area() {
		return width * height;
	}

	public String toString() {
		return super.toString() + "\t with length = " + height + " and width = " + width;
	}

}
