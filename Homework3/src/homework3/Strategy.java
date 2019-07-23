package homework3;

/**
 * This class represents the strategy of the war. it controls the strategy level
 * and the conquered of the world.
 * 
 * Getters: 
 * 	conqueredTheWorld() // returns conqueredTheWorld
 * 	getStrategyLevel() // returns strategyLevel
 * 
 * Constructors:
 * 	Strategy() // sets strategyLevel = 0, conqueredTheWorld = false
 * 
 * Methods:
 * 	checkStrategyLevel() // checks if strategyLevel is more than 180
 * 	battle() // increases strategyLevel by BATTLE_INCREASE
 * 	siege() // increases strategyLevel by SIEGE_INCREASE
 * 
 * @author Marios
 *
 */
public class Strategy {
	// Variables
	private static final int BATTLE_INCREASE = 10;
	private static final int SIEGE_INCREASE = 40;
	private int strategyLevel;
	private boolean conqueredTheWorld;

	// Getters
	/**
	 * @return if we hace conquered the world;
	 */
	public boolean conqueredTheWorld() {
		return conqueredTheWorld;
	}

	/**
	 * @return the strategy level;
	 */
	public int getStrategyLevel() {
		return strategyLevel;
	}

	// Constructors
	/**
	 * Initializes the values of a Strategy object
	 */
	public Strategy() {
		strategyLevel = 0;
		conqueredTheWorld = false;
	}

	// Checks the strategy level
	/**
	 * Checks if we have conquered the world
	 */
	private void checkStrategyLevel() {
		if (strategyLevel > 180) {
			conqueredTheWorld = true;
		}
	}

	// Battle
	/**
	 * Increases the strategy level by BATTLE_INCREASE
	 */
	public void battle() {
		strategyLevel += BATTLE_INCREASE;
		checkStrategyLevel();
	}

	// Siege
	/**
	 * Increases the strategy level by SIEGE_INCREASE
	 */
	public void siege() {
		strategyLevel += SIEGE_INCREASE;
	}
}
