
public class Square extends DrawableShape {
	private int side;

	public int getSide() {
		return side;
	}

	public Square(int x, int y, String color, int side) {
		super(x, y, color);
		this.side = side;
	}

	public Square() {
		this.side = 0;
	}

	public void setSide(int s) {
		side += s;
	}

	public int area() {
		return side * side;
	}

	public int perimeter() {
		return side * 4;
	}

	public void draw() {
		for (int i = 0; i < getY(); i++) {
			System.out.println();
		}
		for (int i = 0; i < side; i++) {
			for (int k = 0; k < getX(); k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < side; j++) {
				if (i == 0 || i == side - 1) {
					System.out.print("* ");
				} else {
					if (j == 0 || j == side - 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
