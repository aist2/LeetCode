package medium;

public class MaxSquare {
    public static int maximalSquare(char[][] matrix) {
    	if (matrix==null||matrix.length==0||matrix[0].length==0) return 0;
    	int[][] arr = new int[matrix.length][matrix[0].length];
    	int maxSize = 0;
    	for (int i=0; i<matrix.length; i++) {
    		for (int j=0; j<matrix[0].length; j++) {
    			if (i==0 || j==0)
    				arr[i][j] = matrix[i][j]-'0';
    			else if (matrix[i][j]-'0'==0)
    				arr[i][j]=0;
    			else
    				arr[i][j] = Math.min(Math.min(arr[i-1][j], arr[i][j-1]),arr[i-1][j-1])+1;
    			maxSize = Math.max(maxSize, arr[i][j]);
    		}
    	}
        return maxSize*maxSize;
    }
}
