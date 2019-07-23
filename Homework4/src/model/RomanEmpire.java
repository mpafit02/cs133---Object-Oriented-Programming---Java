package model;

/**
 * RomanEmpire is a type o Civilization. It has the same core as Qin Dynasty and
 * Egypt. The main difference is the Hills and the ability to build a Coliseum.
 * 
 * Getters: getHills, getRangedUnit, getLandmark
 * 
 * Constructors: RomanEmpire(), RomanEmpire(String name)
 * 
 * Methods: explore
 * 
 * @author Marios
 *
 */
class RomanEmpire extends Civilization {

	private Hills hills = new Hills();

	public RomanEmpire() {
		super("Roman Empire");
	}

	/**
	 * @param name;
	 */
	public RomanEmpire(String name) {
		super(name);
	}

	/**
	 * @return hills;
	 */
	public Hills getHills() {
		return hills;
	}

	public String explore() {
		int coalAmount = hills.mineCoal();
		this.produceResources(coalAmount);
		return "You explore your surroundings and acquire " + coalAmount + " coal!";
	}

	@Override
	public MeleeUnit getMeleeUnit() {
		return new LegionUnit(this);
	}

}
