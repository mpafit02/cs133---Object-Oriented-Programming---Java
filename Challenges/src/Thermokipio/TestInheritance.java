package Thermokipio;

class A {
	private String name = "Marios";
	
	public String getName() {
		return name;
	}
}

class B extends A {
	private String name = "Kostas";

	public String getName() {
		return name;
	}
	public void foo() {
		System.out.println(super.getName());
		System.out.println(name);
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.foo();
	}

}
