package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Ranged Unit is a Military Unit.
 * 
 * Returns the following symbol: R
 * 
 * Can only be counter attacked if the enemy is a RangedUnit or if the enemy is a
 * HybridUnit.
 * 
 * Constructor: RangedUnit(Civilization owner)
 * 
 * Methods: symbol, toString, battle
 * 
 * @author Marios
 *
 */

public class RangedUnit extends MilitaryUnit {
	/**
	 * @param owner;
	 */
	public RangedUnit(Civilization owner) {
		super(100, owner, 10, 10, 14, 5, 0, 30);
	}

	@Override
	public void battle(MapObject o) {
		o.damage(this.getDamage());
		if (!o.isDestroyed() && (o instanceof RangedUnit || o instanceof HybridUnit)) {
			damage(((MilitaryUnit) o).getDamage());
		}
	}

	@Override
	public char symbol() {
		return 'R';
	}

	@Override
	public String toString() {
		return "Ranged Unit. " + super.toString();
	}
}
