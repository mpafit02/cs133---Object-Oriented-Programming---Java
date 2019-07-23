package pizza;

public class Mozzarella extends Ingredient {
	private double price;
	private PlainPizza p;

	public Mozzarella(PlainPizza p) {
		System.out.println("Adding Moz");
		this.p = p;
		setCost(0.5);
		addTotalCost(0.5);
	}

	public String getDescription() {
		return "\nCost of Moz: 0.5" + p.getDescription();
	}

	public String toString() {
		return p.toString() + ", mozzarella";
	}
}
