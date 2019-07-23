package model;

/**
 * Building: is an abstract class which creates building objects with parameters
 * (1) the cost to construct the building and (2) the amount of required workers
 * to construct it.
 * 
 * Getters: getGoldGeneration, getResourceGeneration, getFoodGeneration,
 * getTechPointGeneration, getPhilosophyGeneration, getHappinessGeneration
 * 
 * Setters: setGoldGeneration, setResourceGeneration, setFoodGeneration,
 * setTechPointGeneration, setPhilosophyGeneration, setHappinessGeneration
 * 
 * Constructors: Building(int health, Civilization owner, int goldGeneration,
 * int resourceGeneration, int foodGeneration, int techPointGeneration, int
 * philosophyGeneration, int happinessGeneration)
 * 
 * Methods: tick, demolish, toString
 * 
 * Abstract Methods: invest
 * 
 * @author Marios
 */
abstract class Building extends MapObject {
	private int goldGeneration;
	private int resourceGeneration;
	private int foodGeneration;
	private int techPointGeneration;
	private int philosophyGeneration;
	private int happinessGeneration;

	/**
	 * @param health;
	 * @param owner;
	 * @param goldGeneration;
	 * @param resourceGeneration;
	 * @param foodGeneration;
	 * @param techPointGeneration;
	 * @param philosophyGeneration;
	 * @param happinessGeneration;
	 */
	public Building(int health, Civilization owner, int goldGeneration, int resourceGeneration, int foodGeneration,
			int techPointGeneration, int philosophyGeneration, int happinessGeneration) {
		super(health, owner);
		this.goldGeneration = goldGeneration;
		this.resourceGeneration = resourceGeneration;
		this.foodGeneration = foodGeneration;
		this.techPointGeneration = techPointGeneration;
		this.philosophyGeneration = philosophyGeneration;
		this.happinessGeneration = happinessGeneration;
	}

	public abstract void invest();

	public void demolish() {
		getOwner().produceResources(Math.max(resourceGeneration, 5) * 5);
	}

	public void tick() {
		getOwner().getTreasury().earn(goldGeneration);
		getOwner().produceResources(resourceGeneration);
		getOwner().makeFood(foodGeneration);
		getOwner().getTechnology().increaseUnderstanding(philosophyGeneration);
		getOwner().getTechnology().increaseBuildExperience(techPointGeneration);
		getOwner().increaseHappiness(happinessGeneration);
	}

	/**
	 * @return goldGeneration;
	 */
	public int getGoldGeneration() {
		return goldGeneration;
	}

	/**
	 * @param generation;
	 */
	public void setGoldGeneration(int generation) {
		this.goldGeneration = generation;
	}

	/**
	 * @return resourceGeneration;
	 */
	public int getResourceGeneration() {
		return resourceGeneration;

	}

	/**
	 * @param generation;
	 */
	public void setResourceGeneration(int generation) {
		this.resourceGeneration = generation;

	}

	/**
	 * @return foodGeneration;
	 */
	public int getFoodGeneration() {
		return foodGeneration;

	}

	/**
	 * @param generation;
	 */
	public void setFoodGeneration(int generation) {
		this.foodGeneration = generation;

	}

	/**
	 * @return techPointGeneration;
	 */
	public int getTechPointGeneration() {
		return techPointGeneration;

	}

	/**
	 * @param generation;
	 */
	public void setTechPointGeneration(int generation) {
		this.techPointGeneration = generation;

	}

	/**
	 * @return philosophyGeneration;
	 */
	public int getPhilosophyGeneration() {
		return philosophyGeneration;

	}

	/**
	 * @param generation;
	 */
	public void setPhilosophyGeneration(int generation) {
		this.philosophyGeneration = generation;

	}

	/**
	 * @return happinessGeneration;
	 */
	public int getHappinessGeneration() {
		return happinessGeneration;

	}

	/**
	 * @param generation;
	 */
	public void setHappinessGeneration(int generation) {
		this.happinessGeneration = generation;
	}

	@Override
	public String toString() {
		return "Building. " + super.toString();
	}

}
