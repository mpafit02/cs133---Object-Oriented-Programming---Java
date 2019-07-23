
public class LinearEquationGauss {
	double[][] arr;
	int n;

	public LinearEquationGauss(int n) {
		arr = new double[n][n + 1];
		this.n = n;
	}

	public void fill(double[][] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n + 1; j++) {
				this.arr[i][j] = arr[i][j];
			}
		}
	}

	public void print() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++)
				System.out.printf("%2.1f  ", arr[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	public void solve() {
		double[] x = new double[n];
		System.out.println("\nThe matrix is:\n");
		print();

		for (int i = 0; i < n; i++) { // Pivotisation
			for (int k = i + 1; k < n; k++) {
				if (Math.abs(arr[i][i]) < Math.abs(arr[k][i])) {
					for (int j = 0; j <= n; j++) {
						double temp = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = temp;
					}
				}
			}
		}
		System.out.println("\nThe matrix after Pivotisation is:\n");
		print();

		for (int i = 0; i < n - 1; i++) // loop to perform the gauss elimination
			for (int k = i + 1; k < n; k++) {
				double t = arr[k][i] / arr[i][i];
				for (int j = 0; j <= n; j++)
					arr[k][j] = arr[k][j] - t * arr[i][j]; // make the elements below the pivot elements equal to zero
															// or elimnate the variables
			}

		System.out.println("\n\nThe matrix after gauss-elimination is as follows:\n");
		print();

		for (int i = n - 1; i >= 0; i--) // back-substitution
		{ // x is an array whose values correspond to the values of x,y,z..
			x[i] = arr[i][n]; // make the variable to be calculated equal to the rhs of the last equation
			for (int j = i + 1; j < n; j++)
				if (j != i) // then subtract all the lhs values except the coefficient of the variable whose
							// value is being calculated
					x[i] = x[i] - arr[i][j] * x[j];
			x[i] = x[i] / arr[i][i]; // now finally divide the rhs by the coefficient of the variable to be
										// calculated
		}
		System.out.println("\nThe values of the variables are as follows:\n");
		for (int i = 0; i < n; i++)
			System.out.println("x" + (i + 1) + ": " + x[i]); // Print the values of x, y,z,....

	}
}
