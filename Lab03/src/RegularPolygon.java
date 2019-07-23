
public class RegularPolygon {

	private int n;
	private int side;
	private Point center;

	public Point getCenter() {
		return center;
	}

	public RegularPolygon() {
		n = 3;
		side = 1;
		center = new Point();
	}

	public RegularPolygon(int n, int side) {
		this.n = n;
		this.side = side;
		center = new Point();
	}

	public RegularPolygon(int n, int side, double x, double y) {
		this.n = n;
		this.side = side;
		center = new Point(x, y);
	}

	public int getPerimeter() {
		return side * n;
	}

	public double getArea() {
		return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
	}
}
