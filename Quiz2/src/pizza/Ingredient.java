package pizza;

public abstract class Ingredient implements Pizza {
	private static double totalCost = 0;
	private double cost = 0;

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void addTotalCost(double cost) {
		totalCost += cost;
	}

	public double getCost() {
		return totalCost;
	}

}
