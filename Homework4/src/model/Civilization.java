package model;

import java.util.Random;

/**
 * 
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Civilization is the superclass of classes Egypt, QinDynasty and RomanEmpire.
 * Every civilization has Treasury, Technology, Strategy and an array of
 * Settlements.
 * 
 * Constructors:
 * 
 * Civilizations() // sets variables to the default values
 * Civilization(Civilization owner) // sets the name as the owner name
 * Civilization(String name) // sets the name as the name variable
 * 
 * Getters:
 * 
 * getMeleeUnit, getName, getTreasury, getStrategy, getTechnology, getHappiness,
 * getFood, getRecources, getNumSettlements, getRangedUnit, getHybridUnit,
 * getSiegeUnit, getSettlerUnit, getAnglerUnit, getCoalMinerUnit, getFarmerUnit,
 * getMasterBuilderUnit, getSettlement, getFishingShack, getCoalMine, getFarm,
 * getLandmark
 * 
 * Setters: setName
 * 
 * Methods:
 * 
 * explore, incrementNumSettlements, decrementNumSettlements, eat, makeFood,
 * dockResources, produceResources, dockHappiness, increaseHappiness,
 * 
 * @author Marios
 *
 */
public class Civilization {

	private static Random rand = new Random();

	private String name;

	private Technology technology = new Technology();
	private Strategy strategy = new Strategy();

	private int numSettlements;

	private Treasury treasury = new Treasury(50);
	private int food = 50;
	private int resources = 50;
	private int happiness = 50;

	/**
	 * @param name;
	 */
	public Civilization(String name) {
		this.name = name;
	}

	public Civilization() {
		this.name = "Civilization";
	}

	/**
	 * @param owner;
	 */
	public Civilization(Civilization owner) {
		this.name = owner.getName();
	}

	/**
	 * @return "You explore your surroundings and acquire 20 resources!";
	 */
	public String explore() {
		resources += rand.nextInt(20);
		return "You explore your surroundings and acquire 20 resources!";
	}

	/**
	 * @param name;
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return this.name;
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return numSettlements;
	 */
	public int getNumSettlements() {
		return numSettlements;
	}

	public void incrementNumSettlements() {
		numSettlements++;
	}

	public void decrementNumSettlements() {
		numSettlements--;
	}

	/**
	 * @return treasury;
	 */
	public Treasury getTreasury() {
		return treasury;
	}

	/**
	 * @return strategy;
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * @return technology;
	 */
	public Technology getTechnology() {
		return technology;
	}

	/**
	 * @return this.happiness;
	 */
	public int getHappiness() {
		return this.happiness;
	}

	/**
	 * @return this.food;
	 */
	public int getFood() {
		return this.food;
	}

	/**
	 * @return this.resources;
	 */
	public int getResources() {
		return this.resources;
	}

	/**
	 * @param foodAmount;
	 */
	public void eat(int foodAmount) {
		this.food -= foodAmount;
	}

	/**
	 * @param foodAmount;
	 */
	public void makeFood(int foodAmount) {
		this.food += foodAmount;
	}

	/**
	 * @param resourceAmount;
	 */
	public void dockResources(int resourceAmount) {
		this.resources -= resourceAmount;
	}

	/**
	 * @param resourceAmount;
	 */
	public void produceResources(int resourceAmount) {
		this.resources += resourceAmount;
	}

	/**
	 * @param happinessAmount;
	 */
	public void dockHappiness(int happinessAmount) {
		this.happiness -= happinessAmount;
	}

	/**
	 * @param happinessAmount;
	 */
	public void increaseHappiness(int happinessAmount) {
		this.happiness += happinessAmount;
	}

	/**
	 * @return new MeleeUnit(this);
	 */
	public MeleeUnit getMeleeUnit() {
		return new MeleeUnit(this);
	}

	/**
	 * @return new RangedUnit(this);
	 */
	public RangedUnit getRangedUnit() {
		return new RangedUnit(this);
	}

	/**
	 * @return new HybridUnit(this);
	 */
	public HybridUnit getHybridUnit() {
		return new HybridUnit(this);
	}

	/**
	 * @return new SiegeUnit(this);
	 */
	public SiegeUnit getSiegeUnit() {
		return new SiegeUnit(this);
	}

	/**
	 * @param settlementName;
	 * @return new SettlerUnit(this, settlementName);
	 */
	public SettlerUnit getSettlerUnit(String settlementName) {
		return new SettlerUnit(this, settlementName);
	}

	/**
	 * @return new AnglerUnit(this);
	 */
	public AnglerUnit getAnglerUnit() {
		return new AnglerUnit(this);
	}

	/**
	 * @return new CoalMinerUnit(this);
	 */
	public CoalMinerUnit getCoalMinerUnit() {
		return new CoalMinerUnit(this);
	}

	/**
	 * @return new FarmerUnit(this);
	 */
	public FarmerUnit getFarmerUnit() {
		return new FarmerUnit(this);
	}

	/**
	 * @return new MasterBuilderUnit(this);
	 */
	public MasterBuilderUnit getMasterBuilderUnit() {
		return new MasterBuilderUnit(this);
	}

	/**
	 * @param settlementName;
	 * @return new Settlement(this, settlementName);
	 */
	public Settlement getSettlement(String settlementName) {
		return new Settlement(this, settlementName);
	}

	/**
	 * @return new FishingShack(this);
	 */
	public FishingShack getFishingShack() {
		return new FishingShack(this);
	}

	/**
	 * @return new CoalMine(this);
	 */
	public CoalMine getCoalMine() {
		return new CoalMine(this);
	}

	/**
	 * @return new Farm(this);
	 */
	public Farm getFarm() {
		return new Farm(this);
	}

	/**
	 * @return new Landmark(this);
	 */
	public Landmark getLandmark() {
		return new Landmark(this);
	}
}
