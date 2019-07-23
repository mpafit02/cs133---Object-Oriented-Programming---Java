package homework2;

import java.util.Random;

/**
 * The class River provides food to the civilians. Adds and Returns fish through
 * the methods getFish and replenishFish.
 * 
 * Getters:
 * 	getName() // returns name
 * 	getFish() // returns a fish
 * 
 * Constructors:
 * 	River(String name) // sets name to name value, creates an array of Fish with 
 * 					   // the size of 5 
 * 
 * @author Marios
 *
 */
public class River {
	// Variables
	private String name;
	private Fish[] arrOfFish;
	private int count;
	private static Random rand = new Random();

	// Getters
	public String getName() {
		return name;
	}

	// Constructors
	public River(String name) {
		this.name = name;
		arrOfFish = new Fish[5];
		for (int i = 0; i < arrOfFish.length; i++) {
			arrOfFish[i] = new Fish(rand.nextInt(5));
		}
		count = 4;
	}

	// Get Fish
	public Fish getFish() {
		if (count < 0) {
			return null;
		} else {
			Fish fish = arrOfFish[count];
			arrOfFish[count] = null;
			count--;
			return fish;
		}
	}

	// Replenish Fish
	public boolean replenishFish() {
		if (count < 0) {
			for (int i = 0; i < arrOfFish.length; i++) {
				arrOfFish[i] = new Fish(rand.nextInt(5));
			}
			count = 4;
			return true;
		} else {
			return false;
		}
	}
}
