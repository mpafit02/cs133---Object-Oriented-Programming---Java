package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Military Unit is a Unit. Is the superclass for the Hybrid Unit, Melee Unit,
 * BlackPowder Unit, Siege Unit, Legion Unit and Ranged Unit.
 * 
 * Getters: getDamage
 * 
 * Setters: setDamage
 * 
 * Constructors:
 * 
 * MilitaryUnit(int health, Civilization owner, int baseEndurance, int pay, int
 * initialGoldCost, int initialFoodCost, int ResourceCost, int damage),
 * 
 * MilitaryUnit(int health)
 * 
 * 
 * Methods: increaseDamage, tick, battle, toString
 * 
 * @author Marios
 *
 */
abstract class MilitaryUnit extends Unit {
	private int damage;

	/**
	 * @param health;
	 * @param owner;
	 * @param baseEndurance;
	 * @param pay;
	 * @param initialGoldCost;
	 * @param initialFoodCost;
	 * @param ResourceCost;
	 * @param damage;
	 */
	public MilitaryUnit(int health, Civilization owner, int baseEndurance, int pay, int initialGoldCost,
			int initialFoodCost, int ResourceCost, int damage) {
		super(health, owner, baseEndurance, pay, initialGoldCost, initialFoodCost, ResourceCost, 10);
		this.damage = damage;
	}

	/**
	 * @param health;
	 */
	public MilitaryUnit(int health) {
		super(health);
		this.damage = 30;
	}

	/**
	 * @param damage;
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	/**
	 * @return damage;
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param amount;
	 */
	public void increaseDamage(int amount) {
		damage += amount;
	}

	public void tick() {
		super.tick();
		this.setCanAttack(true);
	}

	/**
	 * @param mo;
	 */
	public abstract void battle(MapObject mo);

	/**
	 * @param mo;
	 */
	public void attack(MapObject mo) {
		this.getOwner().getStrategy().battle();
		battle(mo);
		this.setCanAttack(false);
	}

	public String toString() {
		return "Military Unit. " + super.toString();
	}
}
