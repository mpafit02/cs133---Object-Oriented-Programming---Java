package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Legion Unit is a specail Melee Unit. 
 * 
 * Return the following symbol: S 
 * 
 * Legion Unit cannot be counter attacked by a Hybrid Unit. 
 * 
 * Constructor: LegionUnit(Civilization owner)
 * 
 * Methods: symbol, toString, battle
 * 
 * @author Marios
 *
 */
public class LegionUnit extends MeleeUnit {
	/**
	 * @param owner;
	 */
	public LegionUnit(Civilization owner) {
		super(owner);
		this.setDamage((int) (this.getDamage() * 1.5));
	}

	@Override
	public void battle(MapObject o) {
		o.damage(this.getDamage());
		if (!o.isDestroyed() && !(o instanceof HybridUnit)) {
			damage(((MilitaryUnit) o).getDamage());
		}
	}

	@Override
	public char symbol() {
		return 'L';
	}

	@Override
	public String toString() {
		return "Legion. " + super.toString();
	}
}
