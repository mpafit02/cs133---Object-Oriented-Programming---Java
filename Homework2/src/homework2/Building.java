package homework2;

/**
 * Building: is a class which creates building objects with parameters (1) the
 * cost to construct the building and (2) the amount of required workers to
 * construct it.
 * 
 * Getters: 
 * 	getCost() //returns cost 
 * 	getWorkersRequired() //returns workersRequired
 * 
 * Constructors: 
 * 	Building(int cost, int workersRequired) // sets cost and workersRequired
 * 
 * @author Marios
 */
public class Building {
	// Variables
	private int cost;
	private int workersRequired;

	// Getters
	public int getCost() {
		return cost;
	}

	public int getWorkersRequired() {
		return workersRequired;
	}

	// Constructor
	public Building(int cost, int workersRequired) {
		this.cost = cost;
		this.workersRequired = workersRequired;
	}
}