
public class Shape implements ShapeInterface {
	private int offset;

	public Shape(int offset) {
		this.offset = offset;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public void drawAt(int x) {
		for (int i = 0; i < x; i++) {
			System.out.println();
		}
	}

	public void drawHere() {
		for (int i = 0; i < offset; i++) {
			System.out.print("  ");
		}
	}
}
