package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Coliseum is a Landmark which can be constructed in Roman Empire
 * 
 * Constructors: Coliseum(Civilization owner)
 * 
 * Methods: toString
 * 
 * @author Marios
 *
 */
public class Coliseum extends Landmark {
	/**
	 * @param owner;
	 */
	public Coliseum(Civilization owner) {
		super(owner);
		owner.increaseHappiness(50);
	}

	@Override
	public String toString() {
		return "Coliseum. " + super.toString();
	}
}
