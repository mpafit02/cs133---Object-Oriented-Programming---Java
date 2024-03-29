package model;

import java.util.Random;

/**
 * FishingShack is a Building and contains the fish
 * 
 * Getters: getFish
 * 
 * Constructors: FishingShack(Civilization owner)
 * 
 * Methods: invest, toString, replenishFish,
 * 
 * @author Marios
 *
 */
class FishingShack extends Building {
	private Fish[] fish;
	private int numFish;
	private static Random rand = new Random();

	/**
	 * @param owner;
	 */
	public FishingShack(Civilization owner) {
		super(200, owner, 5, 0, 10, 0, 0, 10);
		fish = new Fish[5];
		invest();
	}

	@Override
	public void invest() {
		replenishFish();
		int foodGeneration = 0;
		int goldGeneration = 0;
		for (Fish f : fish) {
			foodGeneration += (int) (f.getHealth() / 2);
			goldGeneration += f.getHealth() - foodGeneration;
		}
		setFoodGeneration(foodGeneration);
		setGoldGeneration(goldGeneration);
	}

	@Override
	public char symbol() {
		return '&';
	}

	/**
	 * @return caught;
	 */
	public Fish getFish() {
		if (numFish == 0) {
			return null;
		}
		Fish caught = fish[--numFish];
		return caught;
	}

	/**
	 * @return boolean;
	 */
	public boolean replenishFish() {
		if (numFish == 0) {
			for (int i = 0; i < fish.length; i++) {
				fish[i] = new Fish(rand.nextInt(5));
				numFish++;
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "FishingShack. " + super.toString();
	}
}
