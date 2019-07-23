
public class Square extends GeometricObjects {

	private int sides;

	public Square(String color) {
		super(color);
		sides = 4;
	}

	public void howToColor() {
		System.out.println("Color all four sides " + getColor());
	}

}
