
public class Mouse {
	public int weight;
	public int age;
	public String color;
	public boolean isClone = false;
	public int lifeSpan = 36;

	public Mouse(Mouse s1) {
		this.weight = s1.weight;
		this.color = s1.color;
		this.age = s1.age;
		isClone = true;
		System.out.println("Cloning a mouse !");
	}

	public Mouse(int weight, String color, int age) {
		this.weight = weight;
		this.color = color;
		this.age = age;
		System.out.println("A new mouse!");
	}

	public Mouse(int weight, String color) {
		this.weight = weight;
		this.color = color;
		this.age = 0;
		System.out.println("A new mouse!");
	}

	public void evolution() {
		while (age != lifeSpan) {
			age++;
			if (age == lifeSpan / 2 && isClone) {
				color = "Green";
			}
		}
	}

	public String toString() {
		if (isClone) {
			return "A " + color + " mouse, cloned, of " + age + " months and of weight " + weight + " grammes";
		} else {
			return "A " + color + " mouse, of " + age + " months and of weight " + weight + " grammes";
		}
	}
}
