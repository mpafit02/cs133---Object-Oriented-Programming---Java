
package cy.ucy.cs.mpafit02.HW1;

import java.util.Scanner;

/**
 * Evaluation is the class which interacts between the client and the Balanced
 * Ternary class The static void method REPL() asks the user for the input. It
 * calls the evaluate method in BalancedTernary to seperate the data.Also REPL
 * method ends the program when evaluate method return the String "quit".
 *
 * @version 1.0
 * @since 01/02/2018
 * @author Marios Pafitis 911719
 * 
 */

public class Evaluation {

	// Input data REPL()
	public static void REPL() {
		Scanner stdin = new Scanner(System.in);
		String input = null;
		String output = null;
		boolean quit = false;
		// Startup message
		System.out.println(" -------------BALANCED TERNARY CALCULATOR-------------");
		System.out.println(
				"\n You can add(+), subtract(-), multiply(*), divide(/), \n find the remainder(%) and the negative(-BT) of a \n balanced ternary number. Also you can convert from \n Decimal to Balanced Ternary (bt ...) and from \n\t Balanced Ternary to Decimal (dec ...)\n");
		do {
			// Read Input
			System.out.print("> ");
			input = stdin.nextLine();
			// Check the input (calls evaluate method)
			output = BalancedTernary.evaluate(input);
			// Check for "quit" to stop the program
			if (output.equals("quit")) {
				quit = true;
				System.out.println("Done.");
			} else {
				// Prints output (Error message, or Balanced Ternary Number)
				System.out.println(output);
			}
		} while (!quit);

		stdin.close();
	}

}
