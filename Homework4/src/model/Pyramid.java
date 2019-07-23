package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Pyramid is a Landmark which can be constructed in Egypt
 * 
 * Constructors: Pyramid(Civilization owner)
 * 
 * Methods: toString
 * 
 * @author Marios
 *
 */
public class Pyramid extends Landmark {
	/**
	 * @param owner;
	 */
	public Pyramid(Civilization owner) {
		super(owner);
		owner.getTechnology().philosophize();
	}

	@Override
	public String toString() {
		return "Pyramid. " + super.toString();
	}
}
