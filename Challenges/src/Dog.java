
public class Dog {

	public class Food {
		private int amount;

		public Food(int amount) {
			this.amount = amount;
		}

		public int getAmount() {
			return amount;
		}

		public void hello() {
			System.out.println("HelloInner");
		}

		public void callHello() {
			Dog.this.hello();
			hello();
			System.out.println();
		}
	}

	private String name;
	private int amount;

	public Dog(String name) {
		this.name = name;
		amount = 0;
	}

	public int eat(int value) {
		Food f = new Food(value);
		amount = f.getAmount();
		return amount;
	}

	public void hello() {
		System.out.println("HelloOuter");
	}
	public void callHello() {
		Dog.this.hello();
		hello();
		System.out.println();
	}
}
