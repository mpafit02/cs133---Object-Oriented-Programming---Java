package homework3;

/**
 * Egypt is a type o civilization. It has the same core as Qin Dynasty and Roman
 * Empire. The main difference is the Desert and the ability to build a Pyramid.
 * Also if you are am Egyptian you can practice Hieroglyphics.
 * 
 * Getters: getDesert() // returns desert
 * 
 * Constructors: Egypt() // sets variables to the default values calling the
 * super Constructor it changes the name of the River and initializes the Desert
 * 
 * Methods: array buildPyramid(Settlement s) // builds a pyramid
 * practiceHieroglyphics() // civilians practice Hieroglyphics
 * 
 * @author Marios
 *
 */
public class Egypt extends Civilizations {
	// Variables
	private Desert desert;

	// Getters
	/**
	 * @return the object Desert;
	 */
	public Desert getDesert() {
		return desert;
	}

	// Constructor
	/**
	 * Initializes the Egypt object into basic values
	 */
	public Egypt() {
		desert = new Desert();
		setRiver("Egypt");
	}

	// Build a Pyramid
	/**
	 * @param s;
	 * @return if we have built a pyramid;
	 */
	public boolean buildPyramid(Settlement s) {
		Building pyramid = new Building(500, 100);
		if (s.build(getTreasury().getCoins(), getPopulation(), pyramid.getCost(), pyramid.getWorkersRequired())) {
			getTechnology().increaseExperience(10);
			getTreasury().spend(500);
			return true;
		}
		return false;
	}

	// Practice Hieroglyphics
	/**
	 * The method improves your writing and increase your happiness by 10
	 */
	public void practiceHieroglyphics() {
		getTechnology().improveWriting();
		getPopulation().increaseHappiness(10);
	}

}
