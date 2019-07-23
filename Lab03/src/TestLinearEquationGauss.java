
public class TestLinearEquationGauss {

	public static void main(String[] args) {
		LinearEquationGauss le = new LinearEquationGauss(3);
		double arr[][] = new double[][] { { 1, 0, -3, 8 }, { 2, 2, 9, 7 }, { 0, 1, 5, -2 } };
		le.fill(arr);
		le.solve();
	}

}
