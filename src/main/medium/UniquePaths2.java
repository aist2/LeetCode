package medium;

public class UniquePaths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i=0; i<arr.length; i++) {
        	for (int j=0; j<arr[0].length; j++) {
        		if (obstacleGrid[i][j]==1)
        			arr[i][j] = 0;
        		else if (i==0 && j==0)
        			arr[i][j] = 1;
        		else if (i==0)
        			arr[i][j] = arr[i][j-1];
        		else if (j==0)
        			arr[i][j] = arr[i-1][j];
        		else
        			arr[i][j] = arr[i][j-1] + arr[i-1][j];
        		
        	}
        }
    	return arr[arr.length-1][arr[0].length-1];
    }
}
