public class TestConstructors {
	public static void main(String[] argv) {
		B b = new B(true);
		System.out.println(b);
		b = new B(false, 5);
		System.out.println(b);
	}
}
