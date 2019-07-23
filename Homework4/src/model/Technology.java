package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Technology is the class which controls the technology level of a Civilization
 * 
 * Getters: getUnderstanding, getBuildExperience
 * 
 * Methods: increaseBuildExperience, increaseBuildExperience, improveWriting
 * builtWonderOfTheWorld, increaseUnderstanding, philosophize, hasTechnologyWin
 * 
 * @author Marios
 *
 */
class Technology {

	private int buildExperience;
	private boolean builtWonderOfTheWorld;

	private int understanding;
	private boolean foundMeaningOfLife;

	/**
	 * @return understanding;
	 */
	public int getUnderstanding() {
		return understanding;
	}

	/**
	 * @return buildExperience;
	 */
	public int getBuildExperience() {
		return buildExperience;
	}

	public void increaseBuildExperience() {
		buildExperience += 20;
		builtWonderOfTheWorld = (buildExperience >= 200);
	}

	/**
	 * @param i;
	 */
	public void increaseBuildExperience(int i) {
		buildExperience += i;
		builtWonderOfTheWorld = (buildExperience >= 200);
	}

	/** 
	 * @return boolean;
	 */
	public boolean builtWonderOfTheWorld() {
		return builtWonderOfTheWorld;
	}

	/**
	 * @param increase;
	 */
	public void increaseUnderstanding(int increase) {
		understanding += increase;
		foundMeaningOfLife = (understanding >= 200);
	}

	public void philosophize() {
		increaseUnderstanding(25);
	}

	public void improveWriting() {
		increaseUnderstanding(10);
	}

	/**
	 * @return boolean;
	 */
	public boolean hasTechnologyWin() {
		return builtWonderOfTheWorld || foundMeaningOfLife;
	}
}
