package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Black Powder Unit is a Siege Unit. It is used only by QinDynasty class
 * 
 * Black Powder Unit cannot be counter attacked.
 * 
 * Black Powder Unit will only deal damage to Buildings
 * 
 * Constructor: BlackPowderUnit(Civilization owner)
 * 
 * Methods: symbol, toString, battle
 * 
 * @author Marios
 *
 */
public class BlackPowderUnit extends SiegeUnit {
	/**
	 * @param owner;
	 */
	public BlackPowderUnit(Civilization owner) {
		super(owner);
	}

	@Override
	public void battle(MapObject o) {
		o.damage(this.getDamage());
	}

	@Override
	public char symbol() {
		return 'B';
	}

	@Override
	public String toString() {
		return "Black Powder Unit. " + super.toString();
	}
}
