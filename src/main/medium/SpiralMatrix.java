package medium;
import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res = new ArrayList<Integer>();
    	if (matrix.length == 0 || matrix[0].length == 0) return res;
    	int topBound = 0;
    	int bottomBound = matrix.length-1;
    	int leftBound = 0;
    	int rightBound = matrix[0].length-1;
    	int iRow = 0;
    	int iCol = 0;
    	res.add(matrix[iRow][iCol]);
    	while (topBound < bottomBound || leftBound < rightBound) {
    		//go right
    		while (iCol < rightBound) {
        		iCol++;
        		res.add(matrix[iRow][iCol]);
        	}
    		if (iRow!=0 && iCol!=0)
    			leftBound++;
    		if (topBound == bottomBound) return res;
    		//go down
        	while (iRow < bottomBound) {
        		iRow++;
        		res.add(matrix[iRow][iCol]);
        	}
    		topBound++;
    		if (leftBound == rightBound) return res;
    		//go left
        	while (iCol > leftBound) {
        		iCol--;
        		res.add(matrix[iRow][iCol]);
        	}
    		rightBound--;
    		if (topBound == bottomBound) return res;
    		//go up
    		while (iRow > topBound) {
        		iRow--;
        		res.add(matrix[iRow][iCol]);
        	}
    		bottomBound--;
    		if (leftBound == rightBound) return res;
    	}
        return res;
    }
}
