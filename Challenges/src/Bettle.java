class Insect {
	int i = 9;
	int j;

	Insect() {
		prt("i = " + i + ", j = " + j);
		j = 39;
	}

	static int x1 = prt("static Insect.x1 initialized");

	static int prt(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Bettle extends Insect {
	int k = prt("Beetle.k initialized");

	Bettle() {
		prt("k = " + k);
		prt("j = " + j);
	}

	static int x2 = prt("static Beetle.x2 initialized");

	public static void main(String[] args) {
		prt("Beetle constructor");
		final Bettle b = new Bettle();
	}
}