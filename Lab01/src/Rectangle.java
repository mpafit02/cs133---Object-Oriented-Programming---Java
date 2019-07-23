
public class Rectangle {
	double x;
	double y;
	double width;
	double height;
	static int counter = 0;

	public Rectangle(Point p1, Point p2) {
		x = min(p1.getX(), p2.getX());
		y = min(p1.getY(), p2.getY());
		width = max(p1.getX(), p2.getX()) - x;
		height = max(p1.getY(), p2.getY()) - y;
	}

	public Rectangle(double width, double height) {
		x = 0;
		y = 0;
		this.width = width;
		this.height = height;

	}

	public Rectangle(Point p1, double width, double height) {
		x = p1.getX();
		y = p1.getY();
		this.width = width;
		this.height = height;

	}

	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		x = min(min(p1.getX(), p2.getX()), min(p3.getX(), p4.getX()));
		y = min(min(p1.getY(), p2.getY()), min(p3.getY(), p4.getY()));
		width = max(max(p1.getX(), p2.getX()), max(p3.getX(), p4.getX())) - x;
		height = max(max(p1.getY(), p2.getY()), max(p3.getY(), p4.getY())) - y;
	}

	public double min(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public void translate(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public double surface() {
		return width * height;
	}

	public boolean contains(Point p1) {
		if ((p1.getX() <= x + width) && (p1.getY() <= y + height)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean contains(Rectangle r1) {
		if ((r1.x >= x) && (r1.y >= y) && (r1.x + width <= x + width) && (r1.y + height <= y + height)) {
			return true;
		} else {
			return false;
		}
	}

	public Rectangle hull(Rectangle arr[]) {
		double xmin = arr[0].x;
		double ymin = arr[0].y;
		double xmax = arr[0].x + arr[0].width;
		double ymax = arr[0].y + arr[0].height;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].x < xmin) {
				xmin = arr[i].x;
			}
			if (arr[i].y < ymin) {
				ymin = arr[i].y;
			}
			if (arr[i].x > xmax) {
				xmax = arr[i].x + arr[i].width;
			}
			if (arr[i].y > ymax) {
				ymax = arr[i].y + arr[i].height;
			}
		}
		Point p1 = new Point(xmin, ymin);
		Point p2 = new Point(xmax, ymax);
		Rectangle rec = new Rectangle(p1, p2);
		return rec;
	}
}
