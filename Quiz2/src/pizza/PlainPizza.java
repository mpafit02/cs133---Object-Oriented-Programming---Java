package pizza;

public class PlainPizza extends Ingredient {
	public PlainPizza() {
		System.out.println("Adding Dough");
		setCost(4.0);
		addTotalCost(4.0);
	}

	public String getDescription() {
		return "\nCost of Dough: 4.0";
	}

	public String toString() {
		return "Thin Dough";
	}
}
