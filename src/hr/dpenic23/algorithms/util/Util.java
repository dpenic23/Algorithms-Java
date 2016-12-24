package hr.dpenic23.algorithms.util;

public class Util {

	public static void printMatrix(int[][] matrix) {

		if (matrix.length == 0) {
			return;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
