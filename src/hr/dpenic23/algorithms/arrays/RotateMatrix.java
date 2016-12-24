package hr.dpenic23.algorithms.arrays;

import static hr.dpenic23.algorithms.util.Util.*;

/**
 * The algorithm which rotates the given matrix for 90 degrees to the right.
 * 
 * @author dpenic23
 *
 */
public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printMatrix(matrix);

		System.out.println();

		rotateMatrix(matrix);
		printMatrix(matrix);

	}

	private static void rotateMatrix(int[][] matrix) throws IllegalArgumentException {

		int n = matrix.length;

		if (n == 0 || n != matrix[0].length) {
			throw new IllegalArgumentException();
		}

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - layer - 1;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];

				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}

	}

}
