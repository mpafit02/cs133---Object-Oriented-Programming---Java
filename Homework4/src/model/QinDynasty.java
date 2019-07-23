package model;

/**
 * QinDynasty is a type o Civilization. It has the same core as Egypt and Roman
 * Empire. The main difference is the Hills and the ability to build a Great Wall.
 * 
 * Getters: getHills, getSiegeUnit, getLandmark
 * 
 * Constructors: QinDynasty(), QinDynasty(String name)
 * 
 * Methods: explore
 * 
 * @author Marios
 *
 */
class QinDynasty extends Civilization {

	private Hills hills = new Hills();

	public QinDynasty() {
		super("Qin Dynasty");
	}

	/**
	 * @param name;
	 */
	public QinDynasty(String name) {
		super(name);
	}

	/**
	 * @return hills;
	 */
	public Hills getHills() {
		return hills;
	}

	@Override
	public String explore() {
		hills.replenishGame();
		int foodAmount = hills.hunt().getHealth();
		this.produceResources(foodAmount);
		return "You explore your surroundings and acquire " + foodAmount + " recources!";
	}

	@Override
	public SiegeUnit getSiegeUnit() {
		return new BlackPowderUnit(this);
	}

	@Override
	public Landmark getLandmark() {
		return new GreatWall(this);
	}
}
