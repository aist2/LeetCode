package medium;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
    	if (m==0 || n==0) return 0;
    	int[][] matrix = new int[m][n]; 
    	matrix[0][0] = 1;
    	for (int iM = 0; iM < m; iM++) {
    		for (int iN = 0; iN < n; iN++) {
    			if (iM+1<m)
    				matrix[iM+1][iN] += matrix[iM][iN];
    			if (iN+1<n)
    				matrix[iM][iN+1] += matrix[iM][iN];
    		}
    	}
        return matrix[m-1][n-1];
    }
}
