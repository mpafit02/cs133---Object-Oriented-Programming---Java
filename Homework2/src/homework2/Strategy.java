package homework2;

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
	public static final int BATTLE_INCREASE = 10;
	public static final int SIEGE_INCREASE = 40;
	private int strategyLevel;
	private boolean conqueredTheWorld;

	// Getters
	public boolean conqueredTheWorld() {
		return conqueredTheWorld;
	}

	public int getStrategyLevel() {
		return strategyLevel;
	}

	// Constructors
	public Strategy() {
		strategyLevel = 0;
		conqueredTheWorld = false;
	}

	// Checks the strategy level
	private void checkStrategyLevel() {
		if (strategyLevel > 180) {
			conqueredTheWorld = true;
		}
	}

	// Battle
	public void battle() {
		strategyLevel += BATTLE_INCREASE;
		checkStrategyLevel();
	}

	// Siege
	public void siege() {
		strategyLevel += SIEGE_INCREASE;
	}
}
