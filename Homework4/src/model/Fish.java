package model;

/**
 * The class Fish creates objects to feed the civilians
 * 
 * Constructors:
 * Fish(int health) 
 * Fish() // healthIncrease = 20
 * 
 * Getters: getHealth
 * 
 * @author Marios
 *
 */
class Fish {
	private int healthIncrease;

	/**
	 * @param health;
	 */
	public Fish(int health) {
		this.healthIncrease = health;
	}

	public Fish() {
		this(20);
	}

	/**
	 * @return healthIncrease;
	 */
	public int getHealth() {
		return healthIncrease;
	}
}
