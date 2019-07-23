
public class RectangleTotal {
	Rectangle[] arr;
	int count = 0;

	public RectangleTotal(int size) {
		arr = new Rectangle[size];
	}

	public void add(Rectangle r1) {
		arr[count] = r1;
		count++;
	}

	public double surface() {
		double sum = 0;
		for (int i = 0; i <= count; i++) {
			sum += arr[i].surface();
		}
		return sum;
	}

	public void translate(int x, int y) {
		for (int i = 0; i <= count; i++) {
			arr[i].translate(x, y);
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
