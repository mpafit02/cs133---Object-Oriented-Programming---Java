abstract class AAAA {
	abstract void firstMethod();

	void secondMethod() {
		System.out.println("SECOND");
		firstMethod();
	}
}

abstract class BBBB extends AAAA {
	@Override
	void firstMethod() {
		System.out.println("FIRST");
		thirdMethod();
	}

	abstract void thirdMethod();
}

class CCCC extends BBBB {
	@Override
	void thirdMethod() {
		System.out.println("THIRD");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		CCCC c = new CCCC();
		c.firstMethod();
		c.secondMethod();
		c.thirdMethod();
	}
}