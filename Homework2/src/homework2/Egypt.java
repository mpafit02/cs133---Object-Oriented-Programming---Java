package homework2;

/**
 * Egypt is a type o civilization. It has the same core as Qin Dynasty and Roman
 * Empire. The main difference is the Desert and the ability to build a Pyramid.
 * Also if you are am Egyptian you can practice Hieroglyphics.
 * 
 * Getters:
 * 	getCoalMine() // returns mine
 * 	getRiver() // returns river
 * 	getNumSettlements() // returns count
 * 	getStrategy() // returns strategy 
 * 	getStrategyLevel() // returns strategy.getStrategyLevel()
 * 	getTechnology() // returns tech
 * 	getTreasury() // returns treasury
 * 	getPopulation() // returns populations
 * 	getSettlements() // returns settlementArray
 * 	getDesert() // returns desert
 * 
 * Constructors:
 * 	Egypt() // sets variables to the default values
 * 
 * Methods:
 * 	settle(Settlement settlement) // adds a settlement in settlements array
 * 	buildPyramid(Settlement s) // builds a pyramid
 * 	practiceHieroglyphics() // civilians practice Hieroglyphics
 * 
 * @author Marios
 *
 */
public class Egypt {
	// Variables
	private Population population;
	private Treasury treasury;
	private CoalMine mine;
	private River river;
	private Technology tech;
	private Strategy strategy;
	private Settlement[] settlementArray;
	private int count;
	private Desert desert;

	// Getters
	public CoalMine getCoalMine() {
		return mine;
	}

	public River getRiver() {
		return river;
	}

	public int getNumSettlements() {
		return count;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public int getStrategyLevel() {
		return strategy.getStrategyLevel();
	}

	public Technology getTechnology() {
		return tech;
	}

	public Treasury getTreasury() {
		return treasury;
	}

	public Population getPopulation() {
		return population;
	}

	public Settlement[] getSettlements() {
		return settlementArray;
	}

	public Desert getDesert() {
		return desert;
	}

	// Constructor
	public Egypt() {
		settlementArray = new Settlement[10];
		count = 0;
		desert = new Desert();
		population = new Population();
		treasury = new Treasury();
		tech = new Technology();
		mine = new CoalMine();
		strategy = new Strategy();
		river = new River("Egypt");
	}

	// Settle
	public boolean settle(Settlement settlement) {
		if (count < settlementArray.length) {
			settlementArray[count] = settlement;
			count++;
			return true;
		}
		return false;
	}

	// Build a Pyramid
	public boolean buildPyramid(Settlement s) {
		Building pyramid = new Building(500, 100);
		if (s.build(treasury.getCoins(), population, pyramid.getCost(), pyramid.getWorkersRequired())) {
			tech.increaseExperience(10);
			treasury.spend(500);
			return true;
		}
		return false;
	}

	// Practice Hieroglyphics
	public void practiceHieroglyphics() {
		tech.improveWriting();
		population.increaseHappiness(10);
	}

}
