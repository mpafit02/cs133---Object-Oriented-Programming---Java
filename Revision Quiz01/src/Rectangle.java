
public class Rectangle {
	private Point p;
	private double width;
	private double height;
	public static int count;

	// Constructors
	public Rectangle(Point p1, Point p2) {
		p = new Point(min(p1.getX(), p2.getX()), min(p1.getY(), p2.getY()));
		width = max(p1.getX(), p2.getX()) - min(p1.getX(), p2.getX());
		height = max(p1.getY(), p2.getY()) - min(p1.getY(), p2.getY());
		count++;
	}

	public Rectangle(Point p1, double width, double height) {
		p = new Point(p1.getX(), p1.getY());
		this.width = width;
		this.height = height;
		count++;
	}

	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		p = new Point(min(min(p1.getX(), p2.getX()), min(p3.getX(), p4.getX())),
				min(min(p1.getY(), p2.getY()), min(p3.getY(), p4.getY())));
		width = max(max(p1.getX(), p2.getX()), max(p3.getX(), p4.getX())) - p.getX();
		height = max(max(p4.getY(), p3.getY()), max(p1.getY(), p2.getY())) - p.getY();
		count++;
	}

	// Minimum
	private double min(double x, double y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

	// Maximum
	private double max(double x, double y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

	// Surface
	public double surface() {
		return width * height;
	}
	
	//Translate
	public void translate(double x, double y) {
		p.setX(p.getX() + x);
		p.setY(p.getX() + x);
	}
}
