package homework2;

/**
 * This class contains an array of Buildings for the Civilization. Adds
 * buildings and controls the expansion of the settlement.
 * 
 * Getters:
 * 	getName() // returns name
 * 	
 * Constructors:
 * 	Settlement(String name) // sets name to name value, creates an array 
 * 							// of Buildings with the size of 100
 * Methods:
 * 	expandSettlement() // expands the settlement array size
 * 	addBuilding(Building b) // adds a building to the Building array 
 * 	build(int allottedMoney, Population population, int cost, int workersRequired)
 * 				// checks if it is possible to build, if we have enough money and workers
 * 	
 * @author Marios
 *
 */
public class Settlement {

	// Variables
	private static Building[] building;
	private static int count;
	private String name;

	// Getters
	public String getName() {
		return name;
	}

	// Constructors
	public Settlement(String name) {
		this.name = name;
		building = new Building[100];
		count = 0;
	}

	// Expand Settlement
	public void expandSettlement() {
		if (count == building.length - 1) {
			Building[] temp = new Building[building.length];
			for (int i = 0; i < building.length; i++) {
				temp[i] = building[i];
			}
			building = new Building[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				building[i] = temp[i];
			}
		}
	}

	// Add Buildings to the array building
	public void addBuilding(Building b) {
		expandSettlement();
		building[count] = b;
		count++;
	}

	// Build
	public boolean build(int allottedMoney, Population population, int cost, int workersRequired) {
		if (cost <= allottedMoney && population.canWork(workersRequired)) {
			Building b = new Building(cost, workersRequired);
			addBuilding(b);
			return true;
		}
		return false;
	}
}
