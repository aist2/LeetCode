package medium;
import java.util.HashSet;
import java.util.Set;

public class SetZeros {
	public static void setZeroes(int[][] matrix) {
		setZeroes2(matrix);
	}

	public static void setZeroes1(int[][] matrix) {
		if (matrix.length < 1 || matrix[0].length < 1)
			return;
		Set<Integer> zeroRows = new HashSet<Integer>();
		Set<Integer> zeroCols = new HashSet<Integer>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					zeroRows.add(i);
					zeroCols.add(j);
				}
			}
		}
		for (int i : zeroRows) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = 0;
			}
		}
		for (int j : zeroCols) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][j] = 0;
			}
		}
	}

	public static void setZeroes2(int[][] matrix) {
		if (matrix.length < 1 || matrix[0].length < 1)
			return;
		boolean col0IsZero = false;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0)
				col0IsZero = true;
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = matrix[0].length - 1; j > 0; j--) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
			if (col0IsZero) matrix[i][0] = 0;
		}
	}
}
