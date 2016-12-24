package hr.dpenic23.algorithms.arrays;

import static hr.dpenic23.algorithms.util.Util.*;

public class SetZeros {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 0, 4 }, { 5, 6, 7, 8 }, { 9, 0, 11, 12 }, { 13, 14, 15, 16 } };
		printMatrix(matrix);

		System.out.println();

		setZeros(matrix);
		printMatrix(matrix);

	}

	private static void setZeros(int[][] matrix) {

		int n = matrix.length;

		if (n == 0) {
			return;
		}

		int m = matrix[0].length;

		boolean[] rows = new boolean[n];
		boolean[] cols = new boolean[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[i] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (rows[i] || cols[j]) {
					matrix[i][j] = 0;
				}
			}
		}

	}

}
