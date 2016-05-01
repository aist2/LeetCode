package medium;
public class RotateImage {
	public static void rotate(int[][] matrix) {
		rotate3(matrix);
	}
	
	public static void rotate1(int[][] matrix) {
		int n = matrix.length;
		if (n == 0)
			return;
		int[][] copy = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				copy[i][j] = matrix[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[j][n-1-i] = copy[i][j];
			}
		}
	}
	
	public static void rotate2(int[][] matrix) {
		int n = matrix.length;
		if (n == 0)
			return;
		int tmp1,tmp2;
		for (int i = 0; i < Math.ceil(n/2.0); i++) {
			for (int j = 0; j < Math.floor(n/2.0); j++) {
				tmp1 = matrix[j][n-1-i];
				matrix[j][n-1-i] = matrix[i][j];
				tmp2 = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = tmp1;
				tmp1 = matrix[n-1-j][i];
				matrix[n-1-j][i] = tmp2;
				matrix[i][j] = tmp1;
			}
		}
	}
	
	public static void rotate3(int[][] matrix) {
		int n = matrix.length;
		if (n == 0)
			return;
		int tmp;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				tmp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n/2; j++) {
				tmp = matrix[i][n-1-j];
				matrix[i][n-1-j] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}
	}
}
