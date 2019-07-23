package homework3;

/**
 * Roman Empire is a type o civilization. It has the same core as Qin Dynasty
 * and Egypt. The main difference is the Hills, the ability to build an
 * Aqueduct, a Bath house and a Villa. Also if you are a Roman you can study
 * Philosophy which increase your understanding.
 * 
 * Getters: getHills() // returns hills
 * 
 * Constructors: RomanEmpire() // sets variables to the default values calling
 * the super Constructor it changes the name of the River and initializes the
 * Hills
 * 
 * Methods: array buildAqueduct(Settlement s) // builds an aqueduct
 * buildBathHouse(Settlement s) // builds a bath house buildVilla(Settlement s)
 * // builds a villa studyPhilosophy() // civilians study Philosophy
 * 
 * @author Marios
 *
 */
public class RomanEmpire extends Civilizations {
	// Variables
	private Hills hills;

	// Getters
	/**
	 * @return the object Hills;
	 */
	public Hills getHills() {
		return hills;
	}

	// Constructor
	/**
	 * Initializes the values for the Roman Empire
	 */
	public RomanEmpire() {
		hills = new Hills();
		setRiver("Roman");
	}

	// Build an Aqueduct
	/**
	 * @param s;
	 * @return if we have built an Aqueduct;
	 */
	public boolean buildAqueduct(Settlement s) {
		Building aqueduct = new Building(250, 130);
		if (s.build(getTreasury().getCoins(), getPopulation(), aqueduct.getCost(), aqueduct.getWorkersRequired())) {
			getTechnology().increaseExperience(10);
			getTreasury().spend(250);
			return true;
		}
		return false;
	}

	// Build a Bath House
	/**
	 * @param s;
	 * @return if we have built a bath house;
	 */
	public boolean buildBathHouse(Settlement s) {
		Building bathHouse = new Building(110, 20);
		if (s.build(getTreasury().getCoins(), getPopulation(), bathHouse.getCost(), bathHouse.getWorkersRequired())) {
			getTechnology().increaseExperience(10);
			getTreasury().spend(110);
			return true;
		}
		return false;
	}

	// Build a Villa
	/**
	 * @param s;
	 * @return if we have built a Villa;
	 */
	public boolean buildVilla(Settlement s) {
		Building villa = new Building(80, 15);
		if (s.build(getTreasury().getCoins(), getPopulation(), villa.getCost(), villa.getWorkersRequired())) {
			getTechnology().increaseExperience(5);
			getTreasury().spend(80);
			return true;
		}
		return false;
	}

	// Study Philosophy
	/**
	 * @return if we have studied Philosophy;
	 */
	public boolean studyPhilosophy() {
		if (getPopulation().getHappiness() >= 10) {
			getTechnology().philosophize();
			getPopulation().decreaseHappiness(10);
			return true;
		}
		return false;
	}
}
