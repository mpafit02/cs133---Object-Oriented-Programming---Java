package Fauna;

public class Animal {

	private int health;
	private boolean isAlive;

	// Getters
	public int getHealth() {
		return health;
	}

	public boolean getIsAlive() {
		return isAlive;
	}

	// Constructor
	public Animal() {
		health = 100;
		isAlive = true;
	}

	public boolean checkHealth() {
		if (health <= 0) {
			isAlive = true;
		}
		return isAlive;
	}
}
