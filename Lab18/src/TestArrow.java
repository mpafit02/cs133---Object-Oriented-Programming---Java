
public class TestArrow {

	public static void main(String[] args) {
		RightArrow ra = new RightArrow(4, 7, 12);
		ra.drawAt();

		ra.drawAt(5);
		LeftArrow la = new LeftArrow(4, 7, 12);
		la.drawAt();
	}

}
