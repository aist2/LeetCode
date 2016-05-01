package medium;

public class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;
        int count = 1;
        int[][] matrix = new int[n][n];
        
    	while (true) {
        	for (int i = left; i <= right; i++) {
        		matrix[top][i] = count++;
        	}
        	top++;
        	if (top > bottom || left > right) break;
        	for (int i = top; i <= bottom; i++) {
        		matrix[i][right] = count++;
        	}
        	right--;
        	if (top > bottom || left > right) break;
        	for (int i = right; i >= left; i--) {
        		matrix[bottom][i] = count++;
        	}
        	bottom--;
        	if (top > bottom || left > right) break;
        	for (int i = bottom; i >= top; i--) {
        		matrix[i][left] = count++;
        	}
        	left++;
        	if (top > bottom || left > right) break;
        }
    	return matrix;
    }
}
