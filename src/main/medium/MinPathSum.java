package medium;

public class MinPathSum {
    public static int minPathSum(int[][] grid) {
    	int[] arr = new int[grid.length];
    	for (int j=0; j<grid[0].length; j++) {
    		for (int i=0; i<grid.length; i++) {
    			if (j==0 && i==0)
    				arr[i] = grid[i][j];
    			else if (i==0)
    				arr[i] = arr[i] + grid[i][j];
    			else if (j==0)
    				arr[i] = arr[i-1] + grid[i][j];
    			else
    				arr[i] = Math.min(arr[i-1],arr[i])+grid[i][j];
    		}
    	}
        return arr[arr.length-1];
    }
}
