
public class Triangle extends Shape implements TriangleInterface {
	private int topWidth;

	public Triangle(int offset, int topWidth) {
		super(offset);
		this.topWidth = topWidth;
	}

	public void set(int x) {
		topWidth = x;
	}

	public void drawAt(int x) {
		for (int i = 0; i < topWidth; i++) {
			super.drawHere();
			for (int j = 0; j < topWidth - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
