package medium;

public class SearchMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		return searchMatrix2(matrix, target);
	}
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length-1;
        int mid;
        int temp;
        while (left < right) {
        	mid = (int) (left + Math.ceil((right - left)/2.0));
        	temp = matrix[mid][0];
        	if (temp == target)
        		return true;
        	else if (temp > target) 
        		right = mid - 1;
        	else
        		left = mid;
        }
        int row = left;
        left = 0;
        right = matrix[0].length - 1;
        while (left < right) {
        	mid = left + (right - left)/2;
        	temp = matrix[row][mid];
        	if (temp == target)
        		return true;
        	else if (temp > target)
        		right = mid;
        	else
        		left = mid + 1;
        }
    	return matrix[row][left] == target;
    }
    
    public static boolean searchMatrix2(int[][] matrix, int target) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
    	int rows = matrix.length, cols = matrix[0].length;
    	int left = 0, right = rows * cols - 1, mid, tmp;
    	while (left <= right) {
    		mid = left + (right - left)/2;
    		tmp = matrix[mid/cols][mid%cols];
    		if (tmp == target) return true;
    		else if (tmp > target) right = mid - 1;
    		else left = mid + 1;
    	}
    	return false;
    }
}
