
public abstract class GenericMatrix<E extends Number> {

	protected abstract E zero();

	protected abstract E add(E o1, E o2);

	protected abstract E multiply(E o1, E o2);

	public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {
		if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
			throw new RuntimeException("The arrays don't have the same size.");
		}

		E[][] matrix = (E[][]) new Number[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = add(matrix1[i][j], matrix2[i][j]);
			}
		}
		return matrix;
	}

	public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
		if (matrix1[0].length != matrix2.length) {
			throw new RuntimeException("The arrays don't have the same size.");
		}

		E[][] matrix = (E[][]) new Number[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = zero();

				for (int k = 0; k < matrix1[0].length; k++) {
					matrix[i][j] = add(matrix[i][j], multiply(matrix1[j][k], matrix2[k][j]));

				}
			}
		}
		return matrix;
	}

	public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(" " + m1[i][j]);
			}
			if (i == m1.length / 2) {
				System.out.print("  " + op + "  ");
			} else {
				System.out.print("     ");
			}
			for (int j = 0; j < m2.length; j++) {
				System.out.print(" " + m2[i][j]);
			}
			if (i == m1.length / 2) {
				System.out.print("  =  ");
			} else {
				System.out.print("     ");
			}
			for (int j = 0; j < m3.length; j++) {
				System.out.print(" " + m3[i][j]);
			}
			System.out.println();
		}

	}
}
