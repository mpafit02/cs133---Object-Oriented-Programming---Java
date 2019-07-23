class NegativeParameterException extends Exception {
	private int value;

	public NegativeParameterException(int value) {
		this.value = value;
	}

	public String getMessage() {
		return value + " is negative : The factorial is not defined";
	}
}

class BigParameterException extends Exception {
	private int value;

	public BigParameterException(int value) {
		this.value = value;
	}

	public String getMessage() {
		return "ExceptionBig: " + value + " is too large for this program";
	}
}

public class Factorial {
	public static void main(String[] arg) {
		int n, factorial = 1;

		try {
			n = Integer.parseInt(arg[0]);
			if (n < 0)
				throw new NegativeParameterException(n);
			else if (n >= 20)
				throw new BigParameterException(n);
			else {
				for (int i = 2; i <= n; i++)
					factorial *= i;
				System.out.println("Factorial of " + n + " : " + factorial);
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NegativeParameterException e) {
			System.out.println(e.getMessage());
		} catch (BigParameterException e) {
			System.out.println(e.getMessage());
		}
	}
}
