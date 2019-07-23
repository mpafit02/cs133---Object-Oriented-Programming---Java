package homework3;

/**
 * The class Resources is the superclass of the subclasses Game and Fish.It
 * represents the food for the civillians
 * 
 * Getters: getHealth() // returns healthIncrease
 * 
 * Constructors: Resources(int health) // sets to healthIncrease the value of health
 * Resources() // sets to healthIncrease the value of 20
 * 
 * @author Marios
 *
 */
public class Resources {
	// Variables
	private int healthIncrease;

	// Getters
	/**
	 * @return the health increase;
	 */
	public int getHealth() {
		return healthIncrease;
	}

	// Constructors
	/**
	 * @param health;
	 * Initializes the values of the Resources object
	 */
	public Resources(int health) {
		healthIncrease = health;
	}

	/**
	 * Initializes the values of the Resources object in 
	 * the default values of healthIncreace to 20
	 */
	public Resources() {
		this(20);
	}
}
