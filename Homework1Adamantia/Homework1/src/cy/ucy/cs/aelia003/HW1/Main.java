package cy.ucy.cs.aelia003.HW1;
import java.util.Scanner;

/**
 * Is the main class . Contains the REPL and the main method.
 * 
 * @author Aelia003
 * @since 4/02/18
 */


public class Main {

	/**
	 * The method takes the input and gives messages from/to user. Create an object.
	 */
	public static void REPL() {
		BalancedTernary bt = new BalancedTernary();
		Scanner input = new Scanner(System.in);
		String decision;
		do {
			System.out.print("> ");
			decision = input.nextLine();
			System.out.println(bt.evaluate(decision));
		} while (decision.compareTo("quit") != 0);
		System.out.println("Done.");
		input.close();
	}

	public static void main(String[] args) {

		REPL();

	}
}
