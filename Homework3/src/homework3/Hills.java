package homework3;

import java.util.Random;

/**
 * The ground of the hills allows to the civilians have access in three
 * recourses: Hunt, Gold and Coal
 *  
 * Constructors:
 * 	Hills() // randomly hides gold coins and coals in different places 
 * 			// in the Hills. It will also fill the Game array with new 
 * 			// wild Game objects
 * 
 * Methods:
 * 	excavate() // randomly looks up a spot in the two dimensional 
 * 			   // goldLocation array and returns the number of gold coins 
 * 			   // found there
 * 	mineCoal() // randomly looks up a spot in the two dimensional coalLocation 
 * 			   // array and returns the number of coals found there
 * 	hunt() // looks at the last Game object in the Game array and returns it
 * 	replenishGame() // randomly generates new Game to fill the Game array. The 
 * 					// numGame value is also reset to the length of the Game array
 * 
 * @author Marios
 *
 */
public class Hills {
	// Variables
	private static Random rand = new Random();

	private Game[] game;
	private int numGame;

	private int[][] goldLocation = new int[25][25];
	private int[][] coalLocation = new int[15][15];

	// Constructors
	/**
	 * Initializes the Hills and creates a Game object
	 */
	public Hills() {
		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 25; j++) {
				goldLocation[i][j] = rand.nextInt(300);
				j += rand.nextInt(4);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				coalLocation[i][j] = rand.nextInt(10) + 1;
			}
		}
		game = new Game[10];
		numGame = 0;
		replenishGame();
	}

	// Excavate
	/**
	 * randomly looks up a spot in the two dimensional goldLocation array
	 * 
	 * @return returns the number of gold coins found in the hill;
	 */
	public int excavate() {
		int i = rand.nextInt(25);
		int j = rand.nextInt(25);

		return goldLocation[i][j];
	}

	// Mine Coal
	/**
	 * randomly looks up a spot in the two dimensional coalLocation array 
	 * 
	 * @return returns the number of coals found there;
	 */
	public int mineCoal() {
		int i = rand.nextInt(15);
		int j = rand.nextInt(15);

		return coalLocation[i][j];
	}

	// Hunt
	/**
	 * looks at the last Game object in the Game array and returns it
	 * 
	 * @return a Game object;
	 */
	public Game hunt() {
		Game hunted;
		if (numGame > 0) {
			hunted = game[--numGame];
		} else {
			hunted = null;
		}
		return hunted;
	}

	// Replenish Game
	/**
	 * Randomly generates new Game to fill the Game array. 
	 * The numGame value is also reset to the length of the Game array
	 * 
	 * @return if the the Game has been replenish or not;
	 */
	public boolean replenishGame() {
		if (numGame == 0) {
			for (int i = 0; i < game.length; i++) {
				game[i] = new Game(rand.nextInt(20));
			}
			numGame = game.length;
			return true;
		}
		return false;
	}
}