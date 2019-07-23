
public abstract class Arrow extends ShapeBase implements ArrowInterface {
	private int offset;
	private int height;
	private int width;

	public Arrow(int offset, int height, int width) {
		super(offset);
		if (width % 2 != 0) {
			width += 1;
		}
		if (height % 2 != 0) {
			width += 1;
		}
		this.offset = offset;
		this.height = height;
		this.width = width;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public void setHeight(int height) {
		if (height % 2 != 0) {
			width += 1;
		}
	}

	public void setWidth(int width) {
		if (width % 2 != 0) {
			width += 1;
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void drawAt(int height, int width) {
		super.drawHere();
	}
	
}
