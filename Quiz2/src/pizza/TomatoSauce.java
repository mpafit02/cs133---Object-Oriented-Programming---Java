package pizza;

public class TomatoSauce extends Ingredient {
	private Mozzarella m;

	public TomatoSauce(Mozzarella m) {
		this.m = m;
		System.out.println("Adding Sauce");
		setCost(0.35);
		addTotalCost(0.35);
	}

	public String getDescription() {
		return "\nCost of Sauce: 0.35" + m.getDescription();
	}

	public String toString() {
		return "Thin Dough";
	}
}
