public class OOPExercises2 {
	static int a = 555;

	public static void main(String[] args) {
		AA objA = new AA();
		BB objB1 = new BB();
		AA objB2 = new BB();
		CC objC1 = new CC();
		BB objC2 = new CC();
		AA objC3 = new CC();
		objA.display();
		objB1.display();
		objB2.display();
		objC1.display();
		objC2.display();
		objC3.display();
	}
}

class AA {
	int a = 100;

	public void display() {
		System.out.printf("a in A = %d\n", a);
	}
} // class A

class BB extends AA {
	private int a = 123;

	public void display() {
		System.out.printf("a in B = %d\n", a);
	}
} // class B

class CC extends BB {
	private int a = 543;

	public void display() {
		System.out.printf("a in C = %d\n", a);
	}
} // class C