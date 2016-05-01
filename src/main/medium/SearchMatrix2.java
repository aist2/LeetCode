package medium;

public class SearchMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int row = 0;
    	int col = n-1;
    	while (row<m && col>=0) {
    		int curr = matrix[row][col];
    		if (curr==target)
    			return true;
    		else if (curr<target)
    			row++;
    		else
    			col--;
    	}
    	return false;
    }
}
