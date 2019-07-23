class A {
	int a = 100;

	public A() {
		// System.out.println("in the constructor of class A: ");
		// System.out.println("a = "+a);
		a = 333;
		// System.out.println("a = "+a);
	}

	public void setA(int value) {
		a = value;
	}

	public int getA() {
		return a;
	}
} // class A

class B extends A {
	private int a = 123;

	public B() {
		a = 2222;
	}

	public void rollBackA() {
		a = super.getA();
	}

	public void setA(int value) {
		a = value;
	}

	public int getA() {
		return a;
	}
} // class B

public class OOPExercises {
	static int a = 555;

	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		System.out.println("in main(): ");
		System.out.println("a = " + a);
		a = 444;
		System.out.println("objB.a = " + objB.getA());
		objA.setA(77777);
		objB.rollBackA();
		System.out.println("After roll back -----");
		System.out.println("a = " + a);
		System.out.println("objA.a = " + objA.getA());
		System.out.println("objB.a = " + objB.getA());
	}
}