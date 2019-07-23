package cy.ucy.cs.aelia003.HW1;

/**
 * The class has methods to evaluate mathematical expressions, 
 * change integer number to balanced ternary numbers and the opposite, 
 * finds the sum/remainder/quotient/product of bt numbers.
 * 
 * @author Aelia003
 * @since 4/02/18
 *
 */

public class BalancedTernary {

	private String mem;
	private String bt;
	/**
	 * The method takes a string and splits the expression at the operator.
	 * Changes the bt numbers to integers,adds and changes the result to bt.
	 * Calls the bt_to_int method to changes the result. 
	 * Calls the split method to split the expression.
	 * @param bt Is the input given from the user.
	 * @return The balanced ternary sum of the numbers.
	 */
	public String add(String bt) {
		String bts[] = bt.split("\\+");
		int numberOne = bt_to_int(bts[0]);
		int numberTwo = bt_to_int(bts[1]);
		this.mem = int_to_bt((numberOne + numberTwo) + "");
		
		return this.mem;
	}

	/**
	 * The method takes a string and splits the expression at the operator.
	 * Changes the bt numbers to integers,subtracts and changes the result to bt.
	 * Calls the bt_to_int method to changes the result. 
	 * Calls the split method to split the expression.
	 * @param bt Is the input given from the user.
	 * @return The balanced ternary difference of the numbers.
	 */
	public String subtract(String bt) {
		String bts[] = bt.split("-");
		int numberOne = bt_to_int(bts[0]);
		int numberTwo = bt_to_int(bts[1]);
		this.mem = int_to_bt((numberOne - numberTwo) + "");
		return this.mem;
	}

	/**
	 * The method takes a string and splits the expression at the operator.
	 * Changes the bt numbers to integers,multiplies and changes the result to bt.
	 * Calls the bt_to_int method to changes the result. 
	 * Calls the split method to split the expression.
	 * @param bt Is the input given from the user.
	 * @return The balanced ternary product of the numbers.
	 */
	public String multiply(String bt) {
		String bts[] = bt.split("\\*");
		int numberOne = bt_to_int(bts[0]);
		int numberTwo = bt_to_int(bts[1]);
		this.mem = int_to_bt((numberOne * numberTwo) + "");
		return this.mem;
	}

	/**
	 * The method takes a string and splits the expression at the operator.
	 * Changes the bt numbers to integers,divides and changes the result to bt.
	 * Calls the bt_to_int method to changes the result. 
	 * Calls the split method to split the expression.
	 * @param bt Is the input given from user.
	 * @return The balanced ternary quotient of the numbers.
	 */
	public String divide(String bt) {
		String bts[] = bt.split("/");
		int numberOne = bt_to_int(bts[0]);
		int numberTwo = bt_to_int(bts[1]);
		if (numberTwo!=0) {
			this.mem = int_to_bt((numberOne / numberTwo) + "");
			return this.mem;
		}
		else{
			System.out.println("Lathos.Adinati praxi");
			return null;}
	}

	/**
	 * The method takes a string and splits the expression at the operator.
	 * Changes the bt numbers to integers,finds the remainder and changes the result to bt.
	 * Calls the bt_to_int method to changes the result. 
	 * Calls the split method to split the expression.
	 * @param bt Is the input given from user.
	 * @return The balanced ternary remainder of the numbers.
	 */
	public String remainder(String bt) {
		String bts[] = bt.split("%");
		int numberOne = bt_to_int(bts[0]);
		int numberTwo = bt_to_int(bts[1]);
		if (numberOne>=numberTwo) {
			this.mem = int_to_bt((numberOne % numberTwo) + "");
			return this.mem;}
		else
			{System.out.println("Lathos.Adinati praxi");
			return null;}
	}

	/**
	 * The method takes the given input and changes it to integer.Multiplies with -1.
	 * @param bt Is the given input from the user.
	 * Calls the method bt_to_int to changes the balanced ternary number to integer.
	 * @return The new bt.
	 */
	public String negate(String bt) {

		int numberOne = bt_to_int(bt);
		this.mem = numberOne * (-1) + "";
		return this.mem;
	}

	/**
	 * The method assigns the mem to bt.
	 * @param bt Is the given input from the user.
	 */
	public void store(String bt) {
		
		this.mem = bt;
	}

	/**
	 * The method changes the balanced ternary numbers to integers.
	 *  Multiplies every digit with powers of three accordingly of the digit's position. 
	 *  Calls the method charAt() to find the char at every position.
	 * @param bt The given balanced ternary input from the user.
	 * @return The integer number of the balanced ternary number.
	 */
	public int bt_to_int(String bt) {
		int number = 0;
		int index = 0;
		for (int j = bt.length() - 1; j >= 0; j--) {
			if (bt.charAt(index) == '1') {
				number += (1 * (Math.pow(3, j)));
			} else if (bt.charAt(index) == 'N') {
				number += ((-1) * (Math.pow(3, j)));
			} else if (bt.charAt(index) == '0') {
				number += (0 * (Math.pow(3, j)));
			}
			index++;
		}
		return number;
	}

	/**
	 * The method changes the integer number to balanced ternary.
	 * While the number isn't 0 , the method finds the remainder of the number divide 3. 
	 * The remainder can be 1,0 or 2. Accordingly to the remainder the number and the result changes.
	 * @param n Is the given integer number.
	 * @return The balanced ternary number of the integer.
	 */
	public String int_to_bt(String n) {
		String BalancedT = "";
		int number=Integer.parseInt(n);
		boolean temp = true;
		while (temp) {
			int rem = number % 3;
			if (rem == 0)
				BalancedT = "0" + BalancedT;
			if (rem == 1) {
				number--;
				BalancedT = "1" + BalancedT;
			}
			if (rem == 2) {
				number++;
				BalancedT = "N" + BalancedT;
			}
			if (rem == -1) {
				number++;
				BalancedT = "N" + BalancedT;
			}
			if (rem == -2) {
				number--;
				BalancedT = "1" + BalancedT;
			}
			number = number / 3;
			if (number == 0)
				temp = false;
		}
		return BalancedT;
	}

	/**
	 * The method gives the integer value of the number stored in mem.
	 * @return The integer value of the number stored in mem
	 */
	public int memory_as_int() {
		return bt_to_int(this.mem);
	}
	/**
	 * The method gives a string representing the balanced tier number stored in mem.
	 * @return The string representing the balanced tier number stored in mem.
	 */
	public String memory_as_bt() {
		return this.bt;
	}

	/**
	 * The method Finds the different parts of the string input.
	 * Evaluates the expressions. Returns the contents of memory as a string.
	 * Calls the methods split,charAt,add,subtract,multiply,divide,remainder,negate,
	 * contains,bt_to_int , int_to_bt,replaceAll,compareTo.
	 * The method splits the input at operators, checks the numbers character by character 
	 * and calls methods accordingly to operators and the input (dec,bt). If the input has mistakes 
	 * the method gives an error message. 
	 * @param input Is the given input from the user.
	 * @return the contents of memory as a string or an error message.
	 */
	
	public String evaluate(String input) {

		String result = null;
		String terms[] = input.split("\\*|-|\\+|/|%|=");
		String termsB[] = input.split("\\s");
		boolean correctInput = true;
		for (int i = 0; i < terms.length; i++) {
			for (int j = 0; j < terms[i].length(); j++) {
				if (terms[i].charAt(j) != '1' && terms[i].charAt(j) != '0' && terms[i].charAt(j) != 'N'
						&& termsB[0].compareTo("dec") != 0 && termsB[0].compareTo("bt") != 0&& terms[i].compareTo("mem") != 0&&terms[i].compareTo("mem") != 0) {

					correctInput = false;
				} else {
					correctInput = true;
				}
			}
		}

		if (termsB[0].compareTo("dec") == 0)
			for (int j = 0; j < termsB[1].length(); j++) {
				if (termsB[1].charAt(j) != '1' && termsB[1].charAt(j) != '0' && termsB[1].charAt(j) != 'N') {

					correctInput = false;
				} else {
					correctInput = true;
				}

			}
		if (termsB[0].compareTo("bt") == 0) {
			if (termsB[1].charAt(0) != '-' && (termsB[1].charAt(0) < 48 && termsB[1].charAt(0) > 57)) {

				correctInput = false;
			} else {
				correctInput = true;
			}
			for (int j = 1; j < termsB[1].length(); j++) {
				if (termsB[1].charAt(0) < 48 && termsB[1].charAt(0) > 57) {

					correctInput = false;
				} else {
					correctInput = true;
				}

			}
		}

		if (correctInput == true) {
			if(input.contains("mem")) {
				input=input.replaceAll("mem", this.mem);
			}
			if (input.contains("+")) {
				result = add(input);
			}
			else if (input.contains("bt")) {
				result = int_to_bt(termsB[1]) + "";
			}
			else if (input.contains("-") && input.charAt(0) != '-') {
				result = subtract(input);
			} else if (input.contains("/")) {
				result = divide(input);
			} else if (input.contains("*")) {
				result = multiply(input);
			} else if (input.contains("%")) {
				result = remainder(input);
			}

			else if (input.contains("-") && input.charAt(0) == '-') {
				result = negate(input);
			} else if (input.contains("=")) {
				store(terms[1]);
			} else if (input.contains("dec")) {
				result = bt_to_int(input) + "";
			} 

		}
		if(result!=null)
			return result;
		else
			return "Error: I don't understand: "+input;
		
	
		}
	
}