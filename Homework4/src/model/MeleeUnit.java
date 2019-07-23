package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Melee Unit is a Military Unit.
 * 
 * Returns the following symbol: M
 * 
 * Can only be counter attacked if the enemy is a MeleeUnit or if the enemy is a
 * HybridUnit.
 * 
 * Constructor: MeleeUnit(Civilization owner)
 * 
 * Methods: symbol, toString, battle
 * 
 * @author Marios
 *
 */

public class MeleeUnit extends MilitaryUnit {
	/**
	 * @param owner;
	 */
	public MeleeUnit(Civilization owner) {
		super(100, owner, 10, 10, 14, 5, 0, 30);
	}

	@Override
	public void battle(MapObject o) {
		o.damage(this.getDamage());
		if (!o.isDestroyed() && (o instanceof MeleeUnit || o instanceof HybridUnit)) {
			damage(((MilitaryUnit) o).getDamage());
		}
	}

	@Override
	public char symbol() {
		return 'M';
	}

	@Override
	public String toString() {
		return "Melee Unit. " + super.toString();
	}
}
