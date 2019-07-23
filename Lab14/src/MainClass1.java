class AAA {
	static void methodOne() {
		System.out.println("AAA");
	}
}

class BBB extends AAA {
	static void methodOne() {
		System.out.println("BBB");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		AAA a = new BBB();
		a.methodOne();
	}
}