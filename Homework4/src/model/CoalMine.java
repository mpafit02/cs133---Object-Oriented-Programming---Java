package model;

/**
 * Author: Marios Pafitis 911719 mpafit02 
 * 
 * This class is responsible for the coal mine. It has a parameter the coal and
 * a final the BURN_COST. It has a constructor which initialize the coal to 20.
 * 
 * Getters: 
 * getBurnCost() // returns burnCost 
 * getCoal() // returns COAL
 * 
 * Constructors: CoalMine(Civilization owner) // sets coal to 20
 * 
 * Methods: invest(), toString()
 * 
 * @author Marios
 *
 */
class CoalMine extends Building {
	private static final int COAL = 20;
	private int burnCost = 10;

	/**
	 * @param owner;
	 */
	public CoalMine(Civilization owner) {
		super(200, owner, 0, 0, 0, 0, 0, 0);
		setResourceGeneration(COAL - burnCost);
	}

	@Override
	public void invest() {
		if (burnCost > 0) {
			burnCost -= 1;
		}
		setResourceGeneration(COAL - burnCost);
	}

	@Override
	public char symbol() {
		return '(';
	}

	/**
	 * @return burnCost;
	 */
	public int getBurnCost() {
		return burnCost;
	}

	/**
	 * @return COAL;
	 */
	public int getCoal() {
		return COAL;
	}

	@Override
	public String toString() {
		return "Coalmine. " + super.toString();
	}
}
