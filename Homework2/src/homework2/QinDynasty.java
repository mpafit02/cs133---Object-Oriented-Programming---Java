package homework2;

/**
 * Qin Dynasty is a type o civilization. It has the same core as Roman Empire
 * and Egypt. The main difference is the Hills, the ability to build a Wall,
 * and a House. Also you can establish Legalism which increase your understanding.
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
 * 	getHills() // returns hills
 * 
 * Constructors:
 * 	RomanEmpire() // sets variables to the default values
 * 
 * Methods:
 * 	settle(Settlement settlement) // adds a settlement in settlements array
 * 	buildWall(Settlement s) // builds a wall
 * 	buildHouse(Settlement s) // builds a house
 * 	establishLegalism() // civilians establish Legalism
 *  
 * @author Marios
 *
 */
public class QinDynasty {
	// Variables
	private Population population;
	private Treasury treasury;
	private CoalMine mine;
	private River river;
	private Technology tech;
	private Strategy strategy;
	private Settlement[] settlementArray;
	private int count;
	private Hills hills;

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

	public Hills getHills() {
		return hills;
	}

	// Constructor
	public QinDynasty() {
		settlementArray = new Settlement[10];
		count = 0;
		population = new Population();
		treasury = new Treasury();
		tech = new Technology();
		mine = new CoalMine();
		strategy = new Strategy();
		hills = new Hills();
		river = new River("Qin River");
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

	// Build a Wall
	public boolean buildWall(Settlement s) {
		Building wall = new Building(1000, 100);
		if (s.build(treasury.getCoins(), population, wall.getCost(), wall.getWorkersRequired())) {
			tech.increaseExperience(10);
			treasury.spend(1000);
			return true;
		}
		return false;
	}

	// Build a House
	public boolean buildHouse(Settlement s) {
		Building house = new Building(30, 8);
		if (s.build(treasury.getCoins(), population, house.getCost(), house.getWorkersRequired())) {
			tech.increaseExperience(10);
			treasury.spend(30);
			return true;
		}
		return false;
	}

	// Establish Legalism
	public boolean establishLegalism() {
		if (population.getHappiness() >= 20) {
			tech.philosophize();
			population.decreaseHappiness(20);
			return true;
		}
		return false;
	}

}
