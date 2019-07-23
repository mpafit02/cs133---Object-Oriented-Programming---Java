package model;

/**
 * The class Game creates objects to feed the civilians
 * 
 * Constructors: Game(int health), Game() // healthIncrease = 20
 * 
 * Getters: getHealth
 * 
 * @author Marios
 *
 */
class Game {
	private int healthIncrease;

	/**
	 * @param healthIncrease;
	 */
	public Game(int healthIncrease) {
		this.healthIncrease = healthIncrease;
	}

	public Game() {
		this(20);
	}

	/**
	 * @return healthIncrease;
	 */
	public int getHealth() {
		return healthIncrease;
	}

}
