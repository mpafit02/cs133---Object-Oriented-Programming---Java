package homework2;

/**
 * The class Fish creates objects to feed the civilians
 * 
 * Getters:
 *	getHealth() // returns healthIncrease
 * 
 * Constructors:
 * 	Fish(int health) // sets to healthIncrease the value of health
 * 	Fish() // sets to healthIncrease the value of 20
 * 
 * @author Marios
 *
 */
public class Fish {
	// Variables
	private int healthIncrease;

	// Getters
	public int getHealth() {
		return healthIncrease;
	}

	// Constructors
	public Fish(int health) {
		this.healthIncrease = health;
	}

	public Fish() {
		this(20);
	}

}