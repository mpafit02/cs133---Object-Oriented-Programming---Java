package homework2;

/**
 * The class Game creates objects to feed the civilians
 * 
 * Getters:
 * 	getHealth() // returns healthIncrease
 * 
 * Constructors:
 * 	Game(int health) // sets to healthIncrease the value of health
 * 	Game() // sets to healthIncrease the value of 20
 *  
 * @author Marios
 *
 */
public class Game {
	// Variables
	private int healthIncrease;

	// Getters
	public int getHealth() {
		return healthIncrease;
	}

	// Constructors
	public Game(int health) {
		healthIncrease = health;
	}

	public Game() {
		this(20);
	}
}
