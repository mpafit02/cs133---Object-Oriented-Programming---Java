package model;

/**
 * This class is responsible for the farming. It is a Building
 * 
 * Constructors: Farm(Civilization owner)
 * 
 * Methods: invest(), toString()
 * 
 * @author Marios
 *
 */

public class Farm extends Building {
	/**
	 * @param owner;
	 */
	public Farm(Civilization owner) {
		super(200, owner, 0, 0, 10, 0, 0, 10);
	}

	@Override
	public void invest() {
		this.setFoodGeneration(this.getFoodGeneration() + 2);

	}

	@Override
	public char symbol() {
		return '+';
	}

	public String toString() {
		return "Farm. " + super.toString();
	}
}
