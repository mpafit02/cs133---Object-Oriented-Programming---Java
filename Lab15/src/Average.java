import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = 0;
		int sum = 0;
		double average;
		boolean error;
		do {
			error = false;
			try {
				System.out.print("How many numbers? : ");
				N = scan.nextInt();
				if (N <= 0)
					throw new Exception("N must be positive.");
			} catch (Exception e) {
				error = true;
				System.out.println(e.getMessage());
				scan.nextLine();
			}
		} while (error);

		for (int i = 0; i < N; i++) {
			do {
				error = false;
				try {
					System.out.print("Give " + (i + 1) + " number: ");
					int num = scan.nextInt();
					sum += num;
				} catch (Exception e) {
					error = true;
					System.out.println(e.getMessage());
					scan.nextLine();
				}
			} while (error);
		}

		average = sum / N;
		System.out.println("The average of " + N + " numbers is: " + average);

		scan.close();
	}
}
