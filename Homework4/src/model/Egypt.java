package model;

/**
 * Egypt is a type o Civilization. It has the same core as Qin Dynasty and Roman
 * Empire. The main difference is the Desert and the ability to build a Pyramid.
 * 
 * Getters: getDesert, getRangedUnit, getLandmark
 * 
 * Constructors: Egypt(), Egypt(String name)
 * 
 * Methods: explore
 * 
 * @author Marios
 *
 */
class Egypt extends Civilization {

	private Desert desert = new Desert();

	public Egypt() {
		super("Egypt");
	}

	/**
	 * @param name;
	 */
	public Egypt(String name) {
		super(name);
	}

	/**
	 * @return desert;
	 */
	public Desert getDesert() {
		return desert;
	}

	public String explore() {
		int goldAmount = desert.findTreasure();
		this.getTreasury().earn(goldAmount);
		return "You explore your surroundings and acquire " + goldAmount + " gold!";
	}

	public RangedUnit getRangedUnit() {
		return new WarChariot(this);
	}

	@Override
	public Landmark getLandmark() {
		return new Pyramid(this);
	}
}
