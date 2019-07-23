package homework3;

/**
 * Qin Dynasty is a type o civilization. It has the same core as Roman Empire
 * and Egypt. The main difference is the Hills, the ability to build a Wall, and
 * a House. Also you can establish Legalism which increase your understanding.
 * 
 * Getters: getHills() // returns hills
 * 
 * Constructors: QinDynasty() // sets variables to the default values calling
 * the super Constructor it changes the name of the River and initializes the
 * Hills
 * 
 * Methods: adds a settlement in settlements array buildWall(Settlement s) //
 * builds a wall buildHouse(Settlement s) // builds a house establishLegalism()
 * // civilians establish Legalism
 * 
 * @author Marios
 *
 */
public class QinDynasty extends Civilizations {
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
	 * Creates a QinDynasty object
	 */
	public QinDynasty() {
		hills = new Hills();
		setRiver("Qin River");
	}

	// Build a Wall
	/**
	 * @param s;
	 * @return if we have built a wall;
	 */
	public boolean buildWall(Settlement s) {
		Building wall = new Building(1000, 100);
		if (s.build(getTreasury().getCoins(), getPopulation(), wall.getCost(), wall.getWorkersRequired())) {
			getTechnology().increaseExperience(10);
			getTreasury().spend(1000);
			return true;
		}
		return false;
	}

	// Build a House
	/**
	 * @param s;
	 * @return if we have built a house;
	 */
	public boolean buildHouse(Settlement s) {
		Building house = new Building(30, 8);
		if (s.build(getTreasury().getCoins(), getPopulation(), house.getCost(), house.getWorkersRequired())) {
			getTechnology().increaseExperience(10);
			getTreasury().spend(30);
			return true;
		}
		return false;
	}

	// Establish Legalism
	/**
	 * @return if we have establish legalism;
	 */
	public boolean establishLegalism() {
		if (getPopulation().getHappiness() >= 20) {
			getTechnology().philosophize();
			getPopulation().decreaseHappiness(20);
			return true;
		}
		return false;
	}

}
