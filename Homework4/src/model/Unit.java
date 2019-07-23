package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Unit extends from MapObject.
 * 
 * Getters: getCanAttack, getEndurance, getBaseEndurance, getInitialGoldCost,
 * getInitialFoodCost, getInitialResourceCost, getInitialHappinessCost
 * 
 * Setters: setOwner, setCanAttack, setBaseEndurance
 * 
 * Constructors: Unit(int health, Civilization owner, int baseEndurance, int
 * pay, int initialGoldCost, int initialFoodCost, int initialResourceCost, int
 * initialHappinessCost), Unit(Civilization owner), Unit(int health)
 * 
 * Methods: consumeResources, tick, regenerateEndurance, canMove,
 * deductEndurance, isAffordable, applyInitialCosts, toString
 * 
 * @author Marios
 *
 */
abstract class Unit extends MapObject {
	private int baseEndurance;
	private int endurance;
	private int pay;
	private int initialGoldCost;
	private int initialFoodCost;
	private int initialResourceCost;
	private int initialHappinessCost;
	private boolean canAttack;

	/**
	 * @param health;
	 * @param owner;
	 * @param baseEndurance;
	 * @param pay;
	 * @param initialGoldCost;
	 * @param initialFoodCost;
	 * @param initialResourceCost;
	 * @param initialHappinessCost;
	 */
	public Unit(int health, Civilization owner, int baseEndurance, int pay, int initialGoldCost, int initialFoodCost,
			int initialResourceCost, int initialHappinessCost) {
		super(health, owner);
		this.baseEndurance = baseEndurance;
		this.endurance = baseEndurance;
		this.pay = pay;
		this.initialGoldCost = initialGoldCost;
		this.initialFoodCost = initialFoodCost;
		this.initialResourceCost = initialResourceCost;
		this.initialHappinessCost = initialHappinessCost;
	}

	/**
	 * @param owner;
	 */
	public Unit(Civilization owner) {
		this(30, owner, 5, 5, 7, 5, 10, 0);
	}

	 /**
	 * @param health;
	 */
	public Unit(int health) {
		this(health, null, 5, 5, 7, 5, 10, 0);
	}

	public void setOwner(Civilization owner) {
		super.setOwner(owner);
	}

	public void consumeResources() {
		getOwner().getTreasury().spend(pay);
	}

	@Override
	public void tick() {
		consumeResources();
		regenerateEndurance();
	}

	public void regenerateEndurance() {
		this.endurance = this.baseEndurance;
	}

	/**
	 * @return this.canAttack;
	 */
	public boolean getCanAttack() {
		return this.canAttack;
	}

	/**
	 * @param canAttack;
	 */
	public void setCanAttack(boolean canAttack) {
		this.canAttack = canAttack;
	}

	/**
	 * @return this.endurance;
	 */
	public int getEndurance() {
		return this.endurance;
	}

	/**
	 * @return this.baseEndurance;
	 */
	public int getBaseEndurance() {
		return this.baseEndurance;
	}

	/**
	 * @param enduranceCost;
	 * @return boolean;
	 */
	public boolean canMove(int enduranceCost) {
		return endurance >= enduranceCost;
	}

	/**
	 * @param baseEndurance;
	 */
	public void setBaseEndurance(int baseEndurance) {
		this.baseEndurance = baseEndurance;
	}

	/**
	 * @param reduction;
	 */
	public void deductEndurance(int reduction) {
		this.endurance -= reduction;
	}

	/**
	 * @return this.initialGoldCost;
	 */
	public int getInitialGoldCost() {
		return this.initialGoldCost;
	}

	/**
	 * @return this.initialFoodCost;
	 */
	public int getInitialFoodCost() {
		return this.initialFoodCost;
	}

	/**
	 * @return this.initialResourceCost;
	 */
	public int getInitialResourceCost() {
		return this.initialResourceCost;
	}

	/**
	 * @return this.initialHappinessCost;
	 */
	public int getInitialHappinessCost() {
		return this.initialHappinessCost;
	}

	/**
	 * @return boolean;
	 */
	public boolean isAffordable() {
		Civilization owner = getOwner();
		return owner.getTreasury().getCoins() >= initialGoldCost && owner.getFood() >= initialFoodCost
				&& owner.getResources() >= initialResourceCost && owner.getHappiness() >= initialHappinessCost;
	}

	public void applyInitialCosts() {
		getOwner().getTreasury().spend(initialGoldCost);
		getOwner().eat(initialFoodCost);
		getOwner().dockResources(initialResourceCost);
		getOwner().dockHappiness(initialHappinessCost);
	}

	@Override
	public String toString() {
		return "Unit. Endurance: " + endurance + ". " + "Can Attack: " + canAttack + ". " + super.toString();
	}
}
