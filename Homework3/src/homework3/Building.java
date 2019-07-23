package homework3;

/**
 * Building: is a class which creates building objects with parameters (1) the
 * cost to construct the building and (2) the amount of required workers to
 * construct it.
 * 
 * Getters: getCost() //returns cost getWorkersRequired() //returns
 * workersRequired
 * 
 * Constructors: Building(int cost, int workersRequired) // sets cost and
 * workersRequired
 * 
 * @author Marios
 */
public class Building {
	// Variables
	private int cost;
	private int workersRequired;

	// Getters
	/**
	 * @return The method returns the cost of a Building
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @return The method returns the amount of workers required to construct the
	 *         building
	 */
	public int getWorkersRequired() {
		return workersRequired;
	}

	// Constructor

	/**
	 * The construtor creates a building base the cost and the workers required to
	 * construct it
	 * 
	 * @param cost;
	 * @param workersRequired;
	 */
	public Building(int cost, int workersRequired) {
		this.cost = cost;
		this.workersRequired = workersRequired;
	}
}