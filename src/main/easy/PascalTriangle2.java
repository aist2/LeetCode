package easy;

import java.util.ArrayList;
import java.util.List;


public class PascalTriangle2 {
	public static List<Integer> getRow(int rowIndex) {
        return getRow2(rowIndex);
    }
	
	public static List<Integer> getRow1(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        int length;
        int currVal;
        for (int height=0; height<=rowIndex; height++) {
        	length = height+1;
        	List<Integer> row = new ArrayList<Integer>(length);
        	for (int index=0; index<length; index++) {
        		if (index==0 || index==length-1){
            		currVal = 1;
            	}
            	else {
            		currVal = triangle.get(height-1).get(index-1)+triangle.get(height-1).get(index);
            	}
        		row.add(index, currVal);
        	}
        	triangle.add(row);
        }
        return triangle.get(rowIndex);
	}
	
	public static List<Integer> getRow2(int rowIndex){
		List<Integer> row = new ArrayList<Integer>(rowIndex);
		row.add(1);
		for (int height=1; height<=rowIndex; height++) {
			for (int index=height-1; index>=1; index--){
				row.set(index, row.get(index-1)+row.get(index));
			}
			row.add(1);
		}
		return row;
	}
}
