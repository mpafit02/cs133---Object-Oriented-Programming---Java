package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * GreatWall is a Landmark which can be constructed in QinDynasty
 * 
 * Constructors: GreatWall(Civilization owner)
 * 
 * Methods: toString
 * 
 * @author Marios
 *
 */
public class GreatWall extends Landmark {
	/**
	 * @param owner;
	 */
	public GreatWall(Civilization owner) {
		super(owner);
		owner.getStrategy().battle();
	}

	@Override
	public String toString() {
		return "Great Wall. " + super.toString();
	}
}
