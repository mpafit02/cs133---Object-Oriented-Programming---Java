package model;

import java.util.Scanner;
import java.util.Random;

/**
 * This class represents the Desert. It has the function findTreasure() which is
 * used to search for treasure and the function lost() which is used when the
 * player get lost.
 * 
 * Methods: findTreasure() // It generates a number between 1 and 500 which
 * represents the // coins. We get lost 10% each time and if we get lost again,
 * //we don not get any coins. If we do not get lost the second // time we
 * return our coins. lost() // It prints the message that we are lost. We call
 * it inside findTreasure()
 * 
 * @author Marios
 *
 */
class Desert {
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();

	/**
	 * @return coins;
	 */
	public int findTreasure() {
		// A valid treasure trove must be greater than 0
		int coins = rand.nextInt(500) + 1;
		double coinsAftertaxes = coins - coins / 10;
		coins = (int) coinsAftertaxes;
		if (lost()) {
			if (lost()) {
				return 0;
			}
		}
		return coins;
	}

	/**
	 * @return boolean;
	 */
	public boolean lost() {
		boolean error = true;
		do {
			error = false;
			try {
				System.out.println("You have gotten lost! Press 1 to try escaping the"
						+ " Desert.\nHopefully you can make it out alive.");
				int move = scan.nextInt();
				return (move == 1) ? false : true;
			} catch (Exception e) {
				error = true;
				System.out.println();
				scan.nextLine();
			}
		} while (error);
		return false;
	}
}
