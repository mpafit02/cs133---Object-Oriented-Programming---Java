
public class LeftArrow extends Arrow {

	public LeftArrow(int offset, int height, int width) {
		super(offset, height, width);
	}

	public void drawAt() {
		int end = 0;
		for (int i = 0; i < getHeight(); i++) {
			drawHere();
			if (i <= getHeight() / 2) {
				end++;
			} else {
				end--;
			}
			for (int k = 0; k < end; k++) {
				if (k == 0) {
					for (int m = 0; m < getHeight() / 2 - end + 1; m++) {
						System.out.print("  ");
					}
				}
				if (k == 0 || k == end - 1) {
					if (k == end - 1 && i == getHeight() / 2) {
						System.out.print("*");
					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < getWidth(); j++) {
				if (i == getHeight() / 2) {
					System.out.print("*");
				}

			}

			System.out.println();
		}
	}
}
