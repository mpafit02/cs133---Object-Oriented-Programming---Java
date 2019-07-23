public class B extends A {
	boolean verite;
	int value;

	B() {
		System.out.println("constructor B()");
	}

	B(int value) {
		this();
		this.value = value;
		System.out.println("constructor B(int)");
	}

	B(boolean verite) {
		this.verite = verite;
		System.out.println("constructor B(boolean)");
	}

	B(boolean verite, int value) {
		this(value);
		this.verite = verite;
		System.out.println("constructor B(boolean, int)");
	}

	public String toString() {
		return "B : (" + verite + ", " + value + ")\n";
	}
}