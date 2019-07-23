
public class RightArrow extends Arrow {

	public RightArrow(int offset, int height, int width) {
		super(offset, height, width);
	}

	public void drawAt() {
		int end = 0;
		for (int i = 0; i < getHeight(); i++) {
			drawHere();
			for (int j = 0; j < getWidth(); j++) {
				if (i != getHeight() / 2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			if (i <= getHeight() / 2) {
				end++;
			} else {
				end--;
			}
			for (int k = 0; k < end; k++) {
				if (k == 0 || k == end - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}