
public class TestSquare {

	public static void main(String[] args) {
		Square sq1 = new Square(2, 2, "Red", 4);
		sq1.draw();
		System.out.println();
		sq1.move(-2, -2);
		sq1.draw();

		Square sq2 = new Square(1, 2, "Blue", 10);
		sq2.draw();
		System.out.println();
	}

}
