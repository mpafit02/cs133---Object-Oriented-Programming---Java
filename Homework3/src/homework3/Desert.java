package homework3;

import java.util.Random;
import java.util.Scanner;

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
public class Desert {
	// Variables
	private Scanner scan = new Scanner(System.in);
	private Random rand = new Random();

	// Find Treasure
	/**
	 * @return the amount of treasure we have found;
	 */
	public int findTreasure() {
		int num = 1 + rand.nextInt(500);
		int chance = 1 + rand.nextInt(100);
		if (chance <= 10) {
			if (lost()) {
				num = 1 + rand.nextInt(500);
				chance = 1 + rand.nextInt(100);
				if (chance <= 10) {
					if (lost()) {
						return 0;
					}
				}
			}
		}
		return num;
	}

	// Lost
	/**
	 * @return if we are lost or not;
	 */
	public boolean lost() {
		System.out.println(
				"You have gotten lost! Press 1 to try escaping the" + " Desert.\nHopefully you can make it out alive.");
		int move = scan.nextInt();
		return (move == 1) ? false : true;
	}
}