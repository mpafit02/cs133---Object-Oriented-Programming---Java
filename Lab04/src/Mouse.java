
public class Mouse {
	public int lifespan = 36;
	public int age;
	public String color;
	public int weight;
	public boolean clone = false;

	public Mouse(Mouse m1) {
		this.age = m1.age;
		this.lifespan = ((m1.lifespan * 4) / 5);
		this.color = m1.color;
		this.weight = m1.weight;
		clone = true;
		System.out.println("Cloning a mouse !");
	}

	public Mouse(int weight, String color) {
		this.age = 0;
		this.color = color;
		this.weight = weight;
		System.out.println("A new mouse !");
	}

	public Mouse(int weight, String color, int age) {
		this.age = age;
		this.color = color;
		this.weight = weight;
		System.out.println("A new mouse !");
	}

	public String toString() {
		if (clone) {
			return "A " + color + " mouse, cloned, of " + age + " months and of weight " + weight + " grammes";
		} else {
			return "A " + color + " mouse of " + age + " months and of weight " + weight + " grammes";
		}
	}

	private void evolve() {
		age++;
		if (clone && age == (lifespan / 2)) {
			color = "verte";
		}
	}

	public void evolution() {
		for (int i = age; i < lifespan; i++) {
			evolve();
		}
	}
}
