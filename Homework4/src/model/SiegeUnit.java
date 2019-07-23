package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Siege Unit is a Military Unit. 
 * 
 * Return the following symbol: S 
 * 
 * SiegeUnit cannot be counter attacked. 
 * 
 * SiegeUnit will only deal damage to Buildings
 * 
 * Constructor: SiegeUnit(Civilization owner)
 * 
 * Methods: symbol, toString, battle, attack
 * 
 * @author Marios
 *
 */
public class SiegeUnit extends MilitaryUnit {
	/**
	 * @param owner;
	 */
	public SiegeUnit(Civilization owner) {
		super(200, owner, 5, 10, 14, 5, 10, 60);
	}

	@Override
	public void battle(MapObject mo) {
		if (mo instanceof Building) {
			mo.damage(this.getDamage());
		}
	}

	@Override
	public void attack(MapObject mo) {
		this.getOwner().getStrategy().siege();
		this.setCanAttack(false);
	}

	@Override
	public char symbol() {
		return 'S';
	}

	@Override
	public String toString() {
		return "Siege Unit. " + super.toString();
	}

}
