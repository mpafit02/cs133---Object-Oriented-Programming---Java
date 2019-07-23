
public class Hexagon extends RegularPolygon {

	public Hexagon() {
		super(6, 1);
	}

	public Hexagon(int side) {
		super(6, side);
	}

	public Hexagon(int side, int x, int y) {
		super(6, side, x, y);
	}

	public double getArrea() {
		return ((3 * Math.sqrt(3)) / 2) * Math.pow(super.getSide(), 2);
	}

	public String toString() {
		return "with 6 sides and side length: " + super.getSide();
	}
}
