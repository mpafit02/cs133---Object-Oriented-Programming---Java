package model;

/**
 * Landmark is a Building
 * 
 * Constructors: Landmark(Civilization owner)
 * 
 * Methods: invest(), toString()
 * 
 * @author Marios
 *
 */

public class Landmark extends Building {
	/**
	 * @param owner;
	 */
	public Landmark(Civilization owner) {
		super(200, owner, 0, 0, 0, 10, 0, 10);
	}

	@Override
	public void invest() {
		this.setTechPointGeneration(this.getTechPointGeneration() + 5);

	}

	@Override
	public char symbol() {
		return '!';
	}

	public String toString() {
		return "Landmark. " + super.toString();
	}
}
