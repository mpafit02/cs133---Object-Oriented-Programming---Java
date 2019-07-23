package homework3;

/**
 * Civilizations is the superclass of classes Egypt, QinDynasty and RomanEmpire.
 * Every civilization has Population, Treasury, CoalMine, River, Technology,
 * Strategy and an array of Settlements.
 * 
 * Getters: getCoalMine() // returns mine getRiver() // returns river
 * getNumSettlements() // returns count getStrategy() // returns strategy
 * getStrategyLevel() // returns strategy.getStrategyLevel() getTechnology() //
 * returns tech getTreasury() // returns treasury getPopulation() // returns
 * populations getSettlements() // returns settlementArray
 * 
 * Constructors: Civilizations() // sets variables to the default values
 * 
 * Methods: settle(Settlement settlement) // adds a settlement in settlements
 * array buildPyramid(Settlement s) // builds a pyramid practiceHieroglyphics()
 * // civilians practice Hieroglyphics
 * 
 * @author Marios
 *
 */
public class Civilizations {
	private Population population;
	private Treasury treasury;
	private CoalMine mine;
	private River river;
	private Technology tech;
	private Strategy strategy;
	private Settlement[] settlementArray;
	private int count;

	// Getters
	/**
	 * @return The object CoalMine
	 */
	public CoalMine getCoalMine() {
		return mine;
	}

	/**
	 * Sets the parameter name into the River name
	 * 
	 * @param name;
	 */
	public void setRiver(String name) {
		river.setName(name);
	}

	/**
	 * Sets the object strategy into the object Strategy
	 * 
	 * @param strategy;
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the River object
	 */
	public River getRiver() {
		return river;
	}

	/**
	 * @return the amount of Settlements
	 */
	public int getNumSettlements() {
		return count;
	}

	/**
	 * @return the object Strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * @return the Strategy Level
	 */
	public int getStrategyLevel() {
		return strategy.getStrategyLevel();
	}

	/**
	 * @return the Technology object
	 */
	public Technology getTechnology() {
		return tech;
	}

	/**
	 * @return the object Treasury
	 */
	public Treasury getTreasury() {
		return treasury;
	}

	/**
	 * @return the object Population
	 */
	public Population getPopulation() {
		return population;
	}

	/**
	 * @return the Settlement array
	 */
	public Settlement[] getSettlements() {
		return settlementArray;
	}

	// Constructor
	/**
	 * Initializes all the values, base constructor
	 */
	public Civilizations() {
		settlementArray = new Settlement[10];
		count = 0;
		population = new Population();
		treasury = new Treasury();
		tech = new Technology();
		mine = new CoalMine();
		strategy = new Strategy();
		river = new River("Egypt");
	}

	// Settle
	/**
	 * @param settlement;
	 * @return if the Settlement was created  or not
	 */
	public boolean settle(Settlement settlement) {
		if (count < settlementArray.length) {
			settlementArray[count] = settlement;
			count++;
			return true;
		}
		return false;
	}

}
