
public class TriangleGeometricObject extends GeometricObject {
	private int side;

	public TriangleGeometricObject(String color, boolean filled, int side) {
		super(color, filled);
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
	}

	@Override
	public double getPerimeter() {
		return side * 3;
	}

	public int compareTo(Object o) {
		if (this.getArea() > ((TriangleGeometricObject) o).getArea()) {
			return 1;
		} else if (this.getArea() < ((TriangleGeometricObject) o).getArea()) {
			return -1;
		}
		return 0;
	}

}
