package homework2;

/**
 * This class represents the evolution of our Civilization. To achive the
 * Technology win we need to found the meaning of life and build the wonder of
 * the world
 * 
 * Getters:
 * 	getUnderstanding() // returns understanding
 * 	getBuildExperience() // returns experienceLevel
 * 
 * Constructors:
 * 	Technology() // sets understanding = 0,	foundMeaningOfLife = false,	
 *               // experienceLevel = 0, builtWonderOfTheWorld = false
 * 	
 * Methods:
 * 	checkFoundMeaningOfLife() // checks if understanding is more than 200
 * 	philosophize() // increases understanding by 25
 * 	improveWriting() // increases understanding by 10
 * 	increaseExperience(int xp) // increases experienceLevel by xp
 *  hasTechnologyWin() // checks if the techonologic victory has been achieved
 * 
 * @author Marios
 *
 */
public class Technology {

	// Philosophy
	private int understanding;
	private boolean foundMeaningOfLife;

	// Architecture
	private int experienceLevel;
	private boolean builtWonderOfTheWorld;

	// Getters
	public int getUnderstanding() {
		return understanding;
	}

	public int getBuildExperience() {
		return experienceLevel;
	}

	// Constructors
	public Technology() {
		understanding = 0;
		foundMeaningOfLife = false;
		experienceLevel = 0;
		builtWonderOfTheWorld = false;
	}

	// Private method to Check if Found Meaning of Life
	private void checkFoundMeaningOfLife() {
		if (understanding > 200) {
			foundMeaningOfLife = true;
		}
	}

	// Private method to Check if Built the WOnder of the World
	private void checkBuiltWonderOfTheWorld() {
		if (experienceLevel > 200) {
			builtWonderOfTheWorld = true;
		}
	}

	// Philosophize
	public void philosophize() {
		understanding += 25;
		checkFoundMeaningOfLife();
	}

	// Improve Hunting
	public void improveWriting() {
		understanding += 10;
		checkFoundMeaningOfLife();
	}

	// Increase Experience
	public void increaseExperience(int xp) {
		experienceLevel += xp;
		checkBuiltWonderOfTheWorld();
	}

	// Returns if we have a Technology Win
	public boolean hasTechnologyWin() {
		return builtWonderOfTheWorld && foundMeaningOfLife;
	}

}
