/**
 * 
 * @author Marios Pafitis
 * @version v1.0
 * @since 20/01/2018
 *
 */

public class Point {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public boolean same(Point p2) {
		if (this.x == p2.x && this.y == p2.y) {
			return true;
		} else {
			return false;
		}
	}

}
	