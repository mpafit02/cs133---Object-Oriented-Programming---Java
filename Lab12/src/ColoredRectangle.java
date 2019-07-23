
public class ColoredRectangle extends Rectangle {

	private String color;

	public ColoredRectangle(double x, double y, String s) {
		super(x, y);
		color = s;
	}

	public String getColor() {
		return color;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (obj.getClass() != getClass())
			return false;
		else {
			return super.equals(obj) && this.color.equals(((ColoredRectangle) obj).getColor());
		}
	}

	public String toString() {
		return super.toString() + "color = " + color + "\r\n";
	}
}
