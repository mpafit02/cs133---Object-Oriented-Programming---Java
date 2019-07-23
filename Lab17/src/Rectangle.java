
public class Rectangle extends Shape implements RectangleInterface {
	private int topWidth;
	private int topHeight;

	public Rectangle(int offset, int topWidth, int topHeight) {
		super(offset);
		this.topWidth = topWidth;
		this.topHeight = topHeight;
	}

	public void set(int x, int y) {
		topWidth = x;
		topHeight = y;
	}

	public void drawHere() {
		for (int i = 0; i < topHeight; i++) {
			super.drawHere();
			for (int j = 0; j < topWidth; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
