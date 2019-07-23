package homework2;

import java.util.Random;

/**
 * This class represents the population of a civilization. Each population
 * contains warriors and civilians. It controls the happiness of the civilians
 * and if they can battle, work, or cook.
 * 
 * Getters:
 * 	getWarriors() // returns warriors
 * 	getCivilians() // returns civilians
 * 	getHappiness() // returns happiness
 * 
 * Setters:
 * 	setWarriors(int warriors) // sets to warriors the value of warriors
 * 	setCivilians(int civilians) // sets to civilians the value of civilians
 * 
 * Constructors:
 * 	Population() // warriors = 50, civilians = 50, happiness = 200
 * 
 * Methods:
 * 	canBattle() // checks if we have available warriors for battle
 * 	canWork(int people) // checks if we have available civilians for work
 * 	canCook(Game game, CoalMine mine) // checks if we have enough coal to cook the game
 *  canCook(Fish fish, CoalMine mine) // checks if we have enough coal to cook the fish
 *  hunt(Hills hill) // returns hill.hunt()
 *  fish(River river) // returns river.getFish()
 *  increaseHappiness(int value) // increases happiness by the value "value"
 *  decreaseHappiness(int value) // decreases happiness by the value "value" if it is possible
 * 
 * @author Marios
 *
 */
public class Population {
	// Variables
	private Random rand = new Random();
	private int warriors;
	private int civilians;
	private int happiness;

	// Getters
	public int getWarriors() {
		return warriors;
	}

	public int getCivilians() {
		return civilians;
	}

	public int getHappiness() {
		return happiness;
	}

	// Setters
	public void setWarriors(int warriors) {
		this.warriors = warriors;
	}

	public void setCivilians(int civilians) {
		this.civilians = civilians;
	}

	// Constructors
	public Population() {
		warriors = 50;
		civilians = 50;
		happiness = 200;
	}

	// Can Battle
	public boolean canBattle() {
		if (warriors > rand.nextInt(100)) {
			warriors -= rand.nextInt(20);
			return true;
		}
		return false;
	}

	// Can Work
	public boolean canWork(int people) {
		if (people <= civilians) {
			civilians -= people;
			return true;
		}
		return false;
	}

	// Can Cook Game
	public boolean canCook(Game game, CoalMine mine) {
		if (mine.getCoal() >= 4 * mine.getBurnCost()) {
			for (int i = 0; i < 4; i++) {
				mine.burn();
			}
			civilians += 60;
			warriors += 40;
			return true;
		}
		return false;
	}

	// Can Cook Fish
	public boolean canCook(Fish fish, CoalMine mine) {
		if (mine.getCoal() >= 4 * mine.getBurnCost()) {
			for (int i = 0; i < 4; i++) {
				mine.burn();
			}
			civilians += 15;
			warriors += 10;
			return true;
		}
		return false;
	}

	// Hunt
	public Game hunt(Hills hill) {
		return hill.hunt();
	}

	// Fish
	public Fish fish(River river) {
		return river.getFish();
	}

	// Increase Happiness
	public void increaseHappiness(int value) {
		happiness += value;
	}

	// Decrease Happiness
	public void decreaseHappiness(int value) {
		happiness -= value;
		if (happiness < 0) {
			happiness = 0;
		}
	}
}