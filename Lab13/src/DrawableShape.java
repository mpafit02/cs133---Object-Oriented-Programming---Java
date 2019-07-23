
public abstract class DrawableShape {

	private int x;
	private int y;

	private String color;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getColor() {
		return color;
	}

	public DrawableShape() {
		x = 0;
		y = 0;
		color = null;
	}
	
	public DrawableShape(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
}
