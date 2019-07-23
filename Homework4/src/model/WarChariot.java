package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * War Chariot is a specail Ranged Unit. 
 * 
 * Return the following symbol: W
 * 
 * Constructor: WarChariot(Civilization owner)
 * 
 * Methods: symbol, toString
 * 
 * @author Marios
 *
 */
public class WarChariot extends RangedUnit {

	/**
	 * @param owner;
	 */
	public WarChariot(Civilization owner) {
		super(owner);
		this.setBaseEndurance(this.getBaseEndurance() * 2);
	}

	@Override
	public char symbol() {
		return 'W';
	}

	@Override
	public String toString() {
		return "War Chariot Unit. " + super.toString();
	}
}
