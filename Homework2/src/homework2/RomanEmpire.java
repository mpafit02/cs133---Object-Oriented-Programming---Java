package homework2;

/**
 * Roman Empire is a type o civilization. It has the same core as Qin Dynasty
 * and Egypt. The main difference is the Hills, the ability to build an Aqueduct,
 * a Bath house and a Villa. Also if you are a Roman you can study Philosophy
 * which increase your understanding.
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
 * 	buildAqueduct(Settlement s) // builds an aqueduct
 * 	buildBathHouse(Settlement s) // builds a bath house
 * 	buildVilla(Settlement s) // builds a villa
 * 	studyPhilosophy() // civilians study Philosophy
 * 
 * @author Marios
 *
 */
public class RomanEmpire {
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
	public RomanEmpire() {
		settlementArray = new Settlement[10];
		count = 0;
		population = new Population();
		treasury = new Treasury();
		tech = new Technology();
		mine = new CoalMine();
		strategy = new Strategy();
		hills = new Hills();
		river = new River("Roman");
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

	// Build an Aqueduct
	public boolean buildAqueduct(Settlement s) {
		Building aqueduct = new Building(250, 130);
		if (s.build(treasury.getCoins(), population, aqueduct.getCost(), aqueduct.getWorkersRequired())) {
			tech.increaseExperience(10);
			treasury.spend(250);
			return true;
		}
		return false;
	}

	// Build a Bath House
	public boolean buildBathHouse(Settlement s) {
		Building bathHouse = new Building(110, 20);
		if (s.build(treasury.getCoins(), population, bathHouse.getCost(), bathHouse.getWorkersRequired())) {
			tech.increaseExperience(10);
			treasury.spend(110);
			return true;
		}
		return false;
	}

	// Build a Villa
	public boolean buildVilla(Settlement s) {
		Building villa = new Building(80, 15);
		if (s.build(treasury.getCoins(), population, villa.getCost(), villa.getWorkersRequired())) {
			tech.increaseExperience(5);
			treasury.spend(80);
			return true;
		}
		return false;
	}

	// Study Philosophy
	public boolean studyPhilosophy() {
		if (population.getHappiness() >= 10) {
			tech.philosophize();
			population.decreaseHappiness(10);
			return true;
		}
		return false;
	}
}
