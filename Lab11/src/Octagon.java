
public class Octagon extends RegularPolygon {
	public Octagon() {
		super(8, 1);
	}

	public Octagon(int side) {
		super(8, side);
	}

	public Octagon(int side, int x, int y) {
		super(8, side, x, y);
	}

	public double getArrea() {
		return (2 * (1 + Math.sqrt(2))) * Math.pow(super.getSide(), 2);
	}

	public String toString() {
		return "with 8 sides and side length: " + super.getSide();
	}
}
