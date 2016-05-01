package easy;

import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        return generate1(numRows);
    }
    
    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        int length;
        int currVal;
        for (int height=0; height<numRows; height++) {
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
        return triangle;
    }
}
