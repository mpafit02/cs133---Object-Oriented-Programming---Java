
public class GeometricObject {
	private int side;
	private int perimeter;
	private double area;
	
	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getSide() {
		return side;
	}

	public GeometricObject(int side) {
		setSide(side);
	}
	
	public void setSide(int side) {
		this.side = side;
	}
}
