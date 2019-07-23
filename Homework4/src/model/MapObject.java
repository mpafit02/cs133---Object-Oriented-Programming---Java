package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * MapObject is an abstract class. It is responsible for all the objects in the
 * terrain. It implements the interface Symbolizable.
 * 
 * Getters: getOwner
 * 
 * Setters: setOwner
 * 
 * Constructors: MapObject(int health, Civilization owner)
 * 
 * Methods: damage, toString, isDestroyed, tick, symbol
 * 
 * @author Marios
 *
 */

abstract class MapObject implements Symbolizable {
	private int health;
	private Civilization owner;

	/**
	 * @param health;
	 * @param owner;
	 */
	public MapObject(int health, Civilization owner) {
		this.health = health;
		this.owner = owner;
	}

	/**
	 * @return owner;
	 */
	public Civilization getOwner() {
		return owner;
	}

	/**
	 * @param owner;
	 */
	public void setOwner(Civilization owner) {
		this.owner = new Civilization(owner);
	}

	/**
	 * @param healthAmount;
	 */
	public void damage(int healthAmount) {
		this.health -= healthAmount;
	}

	/**
	 * @return boolean;
	 */
	public boolean isDestroyed() {
		return this.health <= 0;
	}

	public abstract void tick();

	public abstract char symbol();

	@Override
	public String toString() {
		return "Health: " + health + ", Owner: " + owner.getName() + ".";
	}

}
