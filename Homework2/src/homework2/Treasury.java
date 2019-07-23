package homework2;

/**
 * Is the class which represents the money of our Civilization. Almost each
 * class interacts with this class.
 * 
 * Getters:
 * 	getCoins() // returns coins
 * 
 * Constructors:
 * 	Treasury() // sets coins the value 200
 * 	
 * Methods:
 * 	spend(int amount) // checks if the amount is less than the coins
 * 					  // and then subtract them
 * 	earn(int amount) // adds to coins the value of amount
 * @author Marios
 *
 */
public class Treasury {
	// Variables
	private int coins;

	// Getters
	public int getCoins() {
		return coins;
	}

	// Constructors
	public Treasury() {
		coins = 200;
	}

	// Spend
	public boolean spend(int amount) {
		if (amount <= coins) {
			coins -= amount;
			return true;
		} else {
			return false;
		}
	}

	// Earn
	public void earn(int amount) {
		coins += amount;
	}
}
