package painting.shapes;

/**
 * @author admin
 *
 */
public class Sphere extends Shape {
	private double radius; // radius in feet

	public Sphere(String shapeName) {
		super(shapeName);
	}

	public Sphere(double r) {
		super("Sphere");
		radius = r;
	}

	/**
	 * 
	 * @see painting.shapes.Shape#area()
	 */
	public double area() {
		return 4 * Math.PI * radius * radius;
	}

	public String toString() {
		return super.toString() + "\t with radius = " + radius;
	}

}