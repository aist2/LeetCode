package medium;

public class NumIslands {
    public static int numIslands(char[][] grid) {
    	if (grid==null||grid.length==0||grid[0].length==0) return 0;
    	int count = 0;
    	for (int i=0; i<grid.length; i++) {
    		for (int j=0; j<grid[0].length; j++) {
    			if (grid[i][j]=='1') {
    				helper(grid, i, j);
    				count++;
    			}
    		}
    	}
        return count;
    }
    
    private static void helper(char[][] grid, int iRow, int iCol) {
    	if (iRow>=grid.length || iCol>=grid[0].length || iRow<0 || iCol<0 || grid[iRow][iCol]!='1')
    		return;
    	grid[iRow][iCol] = '0';
    	helper(grid, iRow-1, iCol);
    	helper(grid, iRow+1, iCol);
    	helper(grid, iRow, iCol+1);
    	helper(grid, iRow, iCol-1);
    }
}
