package homework3;

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
	/**
	 * @return the understanding;
	 */
	public int getUnderstanding() {
		return understanding;
	}

	/**
	 * @return the experienceLevel;
	 */
	public int getBuildExperience() {
		return experienceLevel;
	}

	// Constructors
	/**
	 * Initializes the values for the Technology object
	 */
	public Technology() {
		understanding = 0;
		foundMeaningOfLife = false;
		experienceLevel = 0;
		builtWonderOfTheWorld = false;
	}

	// Private method to Check if Found Meaning of Life
	/**
	 * Checks if we have found the meaning of life
	 */
	private void checkFoundMeaningOfLife() {
		if (understanding > 200) {
			foundMeaningOfLife = true;
		}
	}

	// Private method to Check if Built the Wonder of the World
	/**
	 * Checks if we have Built the Wonder of the World
	 */
	private void checkBuiltWonderOfTheWorld() {
		if (experienceLevel > 200) {
			builtWonderOfTheWorld = true;
		}
	}

	// Philosophize
	/**
	 * Increases the understanding by 25
	 */
	public void philosophize() {
		understanding += 25;
		checkFoundMeaningOfLife();
	}

	// Improve Writing
	/**
	 * Increases the understanding by 10
	 */
	public void improveWriting() {
		understanding += 10;
		checkFoundMeaningOfLife();
	}

	// Increase Experience
	/**
	 * Increases the experienceLevel by xp
	 * @param xp;
	 */
	public void increaseExperience(int xp) {
		experienceLevel += xp;
		checkBuiltWonderOfTheWorld();
	}

	// Returns if we have a Technology Win
	/**
	 * @return if we have a Technology Win;
	 */
	public boolean hasTechnologyWin() {
		return builtWonderOfTheWorld && foundMeaningOfLife;
	}

}
