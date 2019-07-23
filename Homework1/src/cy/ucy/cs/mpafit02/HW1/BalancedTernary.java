package cy.ucy.cs.mpafit02.HW1;

/**
 * This is the class which creates BalancedTernary objects which are numbers
 * which they contain only the letters '0', '1' and 'N'. It has a static String
 * the mem which stores the value of the last calculation, We have to
 * constructors. The first doesn't receive any parameter and sets the value of
 * bt equals to mem. The second receives a value for the bt. The methods the
 * method add, subtract, multiply, divide, remainder, convert the bt numbers in
 * decimal to do the calculations and then back in bt. The method store sets the
 * value of mem equals to bt; The method negate returns the negative value of
 * the balanced ternary number. The method bt_to_int converts a balanced ternary
 * number to integer and returns back a String. The method int_to_bt converts an
 * integer to the balanced ternary system and return a String. The methods
 * memory_as_int and memory_as_bt return the mem as integer or as balanced
 * ternary for each case. Evaluate method call the methods for each case. The
 * method evaluate seperates the input from the REPL method. if the inputs are
 * "+", "-", "*", "/", "%", "=", "dec", "bt" it calls the methods add, subtract,
 * multiply, divide, remainder, negate, int_to_bt, bt_to_int for each case in
 * the class.
 * 
 * @version 1.0
 * @since 01/02/2018
 * @author Marios Pafitis 911719
 */

public class BalancedTernary {
	private String bt;
	private static String mem = "0";

	// Setters
	public void setBt(String bt) {
		this.bt = bt;
	}

	// Getters
	public String getBt() {
		return bt;
	}

	// Constructors
	public BalancedTernary() {
		this.bt = mem;
	}

	public BalancedTernary(String bt) {
		this.bt = bt;
	}

	// Add
	public String add(BalancedTernary BT) {
		return (int_to_bt(bt_to_int() + BT.bt_to_int()));
	}

	// Subtract
	public String subtract(BalancedTernary BT) {
		return (int_to_bt(bt_to_int() - BT.bt_to_int()));
	}

	// Multiply
	public String multiply(BalancedTernary BT) {
		return (int_to_bt(bt_to_int() * BT.bt_to_int()));
	}

	// Divide
	public String divide(BalancedTernary BT) {
		return int_to_bt(bt_to_int() / BT.bt_to_int());
	}

	// Remainder
	public String remainder(BalancedTernary BT) {
		return (int_to_bt(bt_to_int() % BT.bt_to_int()));
	}

	// Negate
	public String negate(String bt) {
		String numBt = "";
		for (int i = 0; i < bt.length(); i++) {
			if (bt.charAt(i) == '1') {
				numBt += "N";
			} else if (bt.charAt(i) == 'N') {
				numBt += "1";
			} else {
				numBt += "0";
			}
		}
		return numBt;
	}

	// Store
	public void store(String bt) {
		mem = bt;
	}

	// BT to Int
	public int bt_to_int() {
		int num = 0;
		int times;
		for (int i = bt.length() - 1; i >= 0; i--) {
			if (bt.charAt(i) == '0') {
				times = 0;
			} else if (bt.charAt(i) == '1') {
				times = 1;
			} else {
				times = -1;
			}
			num += times * Math.pow(3, Math.abs(i - bt.length() + 1));
		}
		return num;
	}

	// Int to BT
	public String int_to_bt(int num) {
		boolean negative = false;
		if (num != 0) {
			if (num < 0) {
				negative = true;
				num *= -1;
			}
			String numBt = "";
			while (num != 0) {
				if (num % 3 == 0) {
					numBt = "0" + numBt;
				} else if (num % 3 == 1) {
					numBt = "1" + numBt;
				} else {
					numBt = "N" + numBt;
					num++;
				}
				num /= 3;
			}
			if (negative) {
				numBt = negate(numBt);
			}
			mem = numBt;
			return mem;
		} else {
			mem = "0";
			return mem;
		}
	}

	// Return mem as Int
	public static int memory_as_int() {
		BalancedTernary BT = new BalancedTernary(mem);
		return BT.bt_to_int();
	}

	// Return mem as String
	public static String memory_as_bt() {
		return mem;
	}

	// Evaluation

	// Checks for Balanced Ternary
	public static boolean isBalancedTernary(String bt) {
		char c;
		boolean isBt = true;
		for (int i = 0; i <= 47; i++) {
			c = (char) i;
			if (bt.contains(c + "")) {
				isBt = false;
			}
		}
		for (int i = 50; i <= 126; i++) {
			c = (char) i;
			if (bt.contains(c + "") && (c != 'N')) {
				isBt = false;
			}
		}
		if (isBt) {
			return true;
		} else {
			return false;
		}
	}

	// Checks for Integer
	public static boolean isInteger(String bt) {
		char c;
		boolean isInt = true;
		for (int i = 0; i <= 47; i++) {
			c = (char) i;
			if (bt.contains(c + "") && (c != '-')) {
				isInt = false;
			}
		}
		for (int i = 58; i <= 126; i++) {
			c = (char) i;
			if (bt.contains(c + "")) {
				isInt = false;
			}
		}
		if (isInt) {
			return true;
		} else {
			return false;
		}
	}

	// Receives a String, Call the methods in BalancedTernary for each case
	/**
	 * @param input
	 *            is the users commands from the REPL method
	 * @return memory is the value of a balanced ternary number or an error message
	 */
	public static String evaluate(String input) {
		String memory = "Syntax Error!";
		String[] values = new String[100];
		int count = 0;
		String[] splitStr = input.split("\\s");
		// Splits the String in the array values[]
		for (int i = 0; i < splitStr.length; i++) {
			String value = "";
			for (int j = 0; j < splitStr[i].length(); j++) {
				char c = splitStr[i].charAt(j);
				if ((c == '-') || (c == '+') || (c == '*') || (c == '/') || (c == '%') || (c == '=')) {
					if (value != " " && value != "") {
						values[count] = value;
						count++;
						value = "";
					}
					values[count] = "" + c;
					count++;
				} else {
					value += c;
				}
			}
			if (value != " " && value != "") {
				values[count] = value;
				count++;
			}
		}
		// Check all inputs
		for (int i = 0; i < count; i++) {
			if (values[i].equals("mem")) {
				values[i] = memory_as_bt();
			}
			// Add
			if (values[i].equals("+") && i != 0 && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}

				BalancedTernary bt1 = new BalancedTernary(values[i - 1]);
				BalancedTernary bt2 = new BalancedTernary(values[i + 1]);
				if (i >= 2 && input.contains("bt")) {
					bt1.setBt(memory_as_bt());
				}
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				memory = bt1.add(bt2);
				bt1.store(memory);
				values[i + 1] = memory_as_bt();
				// Subtract
			} else if (values[i].equals("-") && i != 0 && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}
				BalancedTernary bt1 = new BalancedTernary(values[i - 1]);
				BalancedTernary bt2 = new BalancedTernary(values[i + 1]);
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				memory = bt1.subtract(bt2);
				bt1.store(memory);
				values[i + 1] = memory_as_bt();
				// Negate
			} else if (values[i].equals("-") && i == 0) {
				if (values[i + 1] == null) {
					return "Error: I don't understand: -";
				}
				if (values[i + 1].equals("mem")) {
					try {
						values[i + 1] = memory_as_bt();
						BalancedTernary bt1 = new BalancedTernary(values[i + 1]);
						if (!isBalancedTernary(bt1.getBt())) {
							return "Error: I don't understand: " + bt1.getBt();
						}
						memory = bt1.negate(bt1.getBt());
						bt1.store(memory);
						values[i + 1] = memory_as_bt();
					} catch (Exception StringIndexOutOfBoundsException) {
						return "Error: I don't understand: -";
					}

				} else if (values[i].equals("-mem")) {
					values[i] = memory_as_bt();
					try {
						BalancedTernary bt1 = new BalancedTernary(values[i].substring(1));
						if (!isBalancedTernary(bt1.getBt())) {
							return "Error: I don't understand: " + bt1.getBt();
						}
						memory = bt1.negate(bt1.getBt());
						bt1.store(memory);
						values[i] = memory_as_bt();
					} catch (Exception StringIndexOutOfBoundsException) {
						return "Error: I don't understand: -";
					}
				} else {
					try {
						BalancedTernary bt1 = new BalancedTernary(values[i + 1]);
						if (!isBalancedTernary(bt1.getBt())) {
							return "Error: I don't understand: " + bt1.getBt();
						}
						memory = bt1.negate(bt1.getBt());
						bt1.store(memory);
						values[i + 1] = memory_as_bt();
					} catch (Exception StringIndexOutOfBoundsException) {
						return "Error: I don't understand: -";
					}
				}

				// Multiply
			} else if (values[i].equals("*") && i != 0 && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}
				BalancedTernary bt1 = new BalancedTernary(values[i - 1]);
				BalancedTernary bt2 = new BalancedTernary(values[i + 1]);
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				memory = bt1.multiply(bt2);
				bt1.store(memory);
				values[i + 1] = memory_as_bt();
				// Divide
			} else if (values[i].equals("/") && i != 0 && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}
				BalancedTernary bt1 = new BalancedTernary(values[i - 1]);
				BalancedTernary bt2 = new BalancedTernary(values[i + 1]);
				if (bt2.bt_to_int() == 0) {
					return "Error: Zero Division";
				}
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				memory = bt1.divide(bt2);
				bt1.store(memory);
				values[i + 1] = memory_as_bt();
				// Remainder
			} else if (values[i].equals("%") && i != 0 && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}
				BalancedTernary bt1 = new BalancedTernary(values[i - 1]);
				BalancedTernary bt2 = new BalancedTernary(values[i + 1]);
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				memory = bt1.remainder(bt2);
				bt1.store(memory);
				values[i + 1] = memory_as_bt();
				// Store
			} else if (values[i].equals("=") && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}
				BalancedTernary bt1 = new BalancedTernary(values[i + 1]);
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				bt1.store(values[i + 1]);
				memory = "Store Success!";
				return memory;
				// Check for BT to Int
			} else if (values[i].equals("dec") && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_bt();
				}
				BalancedTernary bt1 = new BalancedTernary(values[i + 1]);
				if (!isBalancedTernary(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				memory = bt1.bt_to_int() + "";
				bt1.store(bt1.int_to_bt(Integer.parseInt(memory)));
				// Check for Int to BT
			} else if (values[i].equals("bt") && i != count - 1) {
				if (values[i + 1].equals("mem")) {
					values[i + 1] = memory_as_int() + "";
				} else if (values[i + 1].equals("-") && values[i + 2].equals("mem")) {
					values[i + 1] = "-" + memory_as_int();
				}
				BalancedTernary bt1 = new BalancedTernary();
				if (!isInteger(values[i + 1])) {
					return "Error: I don't understand: " + values[i + 1];
				}
				if (values[i + 1].equals("-") && i != count - 1) {
					values[i + 1] = "-" + values[i + 2];
					values[i + 2] = "";
				}
				memory = bt1.int_to_bt(Integer.parseInt(values[i + 1]));
				values[i + 1] = memory_as_bt();
				// Check for quit
			} else if (values[i].equals("quit")) {
				memory = "quit";
			} else if (!isBalancedTernary(values[i])) {
				return "Error: I don't understand: " + values[i];
			}
		}
		return memory;
	}
}
