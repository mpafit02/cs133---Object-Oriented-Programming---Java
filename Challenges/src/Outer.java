
public class Outer {
	public static void main(String args[]) {
		OuterClass oc = new OuterClass();
		Inner i = oc.inner(3);
		System.out.println(i.getX());
		Inner i2 = new Inner(3);
		System.out.println(i2.getX());
	}
}

class OuterClass {
	private int x;

	public OuterClass() {
		x = 0;
	}
	
	//Epistrofi anonymis essoterikis klasis
	public Inner inner(final int i) { 
		int x = i;
		return new Inner(x) {

			public int getX() {
				return x + 3;
			}
		};
	}
}

class Inner {
	private int x;

	public Inner(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
}