package homework2;

/**
 * This class is responsible for the coal mine. It has a parameter the coal and
 * a final the BURN_COST. It has a constructor which initialize the coal to 20.
 * Method of the class is the burn() which uses coal, and increaseCoal() which
 * adds coal.
 * 
 * Getters:
 * 	getBurnCost() // returns BURN_COST
 * 	getCoal() // returns coal
 * 	
 * Constructors:
 *  CoalMine() // sets coal to 20
 *  
 * Methods:
 * 	burn() // if we have coal we use it
 * 	increaseCoal(int addedCoal) // adds the passed in parameter in the coal
 * @author Marios
 *
 */
public class CoalMine {
	private int coal;
	private static final int BURN_COST = 10;

	// Getters
	public int getBurnCost() {
		return BURN_COST;
	}

	public int getCoal() {
		return coal;
	}

	// Constructor
	public CoalMine() {
		coal = 20;
	}

	// Burn coal
	public boolean burn() {
		if (coal >= BURN_COST) {
			coal -= BURN_COST;
			return true;
		}
		return false;
	}

	// Add coal
	public void increaseCoal(int addedCoal) {
		coal += addedCoal;
	}
}